import requests
import os
import re
from html import unescape


class Leetcode:
    def __init__(self, question, time_complexity, space_complexity, languages):
        self.question = question
        self.time_complexity = time_complexity
        self.space_complexity = space_complexity
        self.languages = languages
        self.url = "https://leetcode.com/graphql"
        self.question_query = """
        query questionData($titleSlug: String!) {
            question(titleSlug: $titleSlug) {
                questionId
                title
                titleSlug
                content
                difficulty
                exampleTestcases
                categoryTitle
                topicTags {
                    name
                    slug
                    translatedName
                }
                hints
                challengeQuestion {
                    id
                    date
                    incompleteChallengeCount
                    streakCount
                    type
                }
            }
        }
        """
        self.variable = {"titleSlug": self.question}
        self.question_data = None
        self.post_data_format = """---
layout: post
author: Rajat Srivastava
title: {title}
topics: {topics}
langs: {languages}
tc: {tc}
sc: {sc}
leetid: {leetcode_id}
companies:
---
{content}
        """

    def retrieve_question_data(self):
        response = requests.post(self.url, json={'query': self.question_query, 'variables': self.variable})
        self.question_data = response.json()['data']['question']

    def create_post_data(self):
        html_content = unescape(self.question_data['content'])
        markdown_content = re.sub(r'\n\n', r'\n', html_content)
        markdown_content = re.sub(r'<p>(.*?)</p>', r'\1\n', markdown_content)
        markdown_content = re.sub(r'<code>(.*?)</code>', r'`\1`', markdown_content)
        markdown_content = re.sub(r'<strong>(.*?)</strong>', r'**\1**', markdown_content)
        markdown_content = re.sub(r'<strong class="example">(.*?)</strong>', r'**\1**', markdown_content)
        markdown_content = re.sub(r'<em>(.*?)</em>', r'*\1*', markdown_content)
        markdown_content = re.sub(r'<pre>(.*?)</pre>', lambda match: f'```{match.group(1)}```',
                                  markdown_content, flags=re.DOTALL)
        markdown_content = re.sub(r'<ul>(.*?)</ul>', r'\1', markdown_content)
        markdown_content = re.sub(r'<ul>', r'', markdown_content)
        markdown_content = re.sub(r'</ul>', r'', markdown_content)
        markdown_content = re.sub(r'<li>(.*?)</li>', r'\n* \1', markdown_content)
        markdown_content = re.sub(r'&nbsp;', r' ', markdown_content)
        markdown_content = re.sub(r'\*\*Input:\*\*', r'Input:', markdown_content)
        markdown_content = re.sub(r'\*\*Output:\*\*', r'Output:', markdown_content)
        markdown_content = re.sub(r'\*\*Explanation:\*\*', r'Explanation:', markdown_content)
        markdown_content = re.sub(r'(\*\*Example 1:\*\*)', r'---\n## Test Cases\n\1', markdown_content)
        markdown_content = re.sub(r'\n(\n+)', r'\n', markdown_content)
        markdown_content = re.sub(r' ', r' ', markdown_content)

        return self.format_content(markdown_content)

    def format_content(self, content):
        topics = ' '.join([tag['slug'] for tag in self.question_data['topicTags']])
        return self.post_data_format.format(
            title=self.question_data['title'],
            topics=topics,
            leetcode_id=self.question_data['questionId'],
            tc=self.time_complexity,
            sc=self.space_complexity,
            languages=self.languages if self.languages != '' else 'java',
            content=content
        )

    def create_file(self, content, ext='md'):
        difficulty_path = '_{}'.format(self.question_data['difficulty'].lower())
        file_name = os.path.join('..', 'posts', difficulty_path, self.question + '.' + ext)
        # print(file_name, content)
        os.makedirs(os.path.dirname(file_name), exist_ok=True)
        with open(file_name, 'w') as text_file:
            text_file.write(content)

    def generate_question(self):
        self.retrieve_question_data()
        post_data = self.create_post_data()
        self.create_file(post_data, 'md')
        # self.create_file(self.format_content(self.question_data['content']), 'html')
        print('Successfully created post for ', self.question)


if __name__ == '__main__':
    ques = input('Question title: ')
    tc = input('Time complexity: ')
    sc = input('Space complexity: ')
    languages = input('Available languages (default java): ')
    leetcode = Leetcode(ques, tc, sc, languages)
    leetcode.generate_question()
