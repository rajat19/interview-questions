import requests
import os
import re
from html import unescape

question_query = """
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
    }
}
"""

post_data_format = """---
layout: post
author: Rajat Srivastava
title: {title}
difficulty: {difficulty}
topics: {topics}
langs: {languages}
tc: {tc}
sc: {sc}
leetid: {leetcode_id}
gfg: {gfg}
interviewbit: {interviewbit}
hackerrank: {hackerrank}
companies: {companies}
---
{content}
"""


def format_complexity(complexity: str) -> str:
    return complexity if complexity.startswith('O') else f'O({complexity})'


class Leetcode:
    def __init__(self):
        self.root_path = os.path.join(os.path.dirname(__file__), '..', '..')
        self.url = "https://leetcode.com/graphql"
        self.question_data = None

    def take_input(self):
        self.question = input('Leetcode path [url path joined by dash]: ')
        self.variable = {"titleSlug": self.question}
        tc = input('Time complexity [O(...) use <sup></sup> to fill power]: ')
        sc = input('Space complexity [O(...) use <sup></sup> to fill power]: ')
        langs = input('Available languages (default java) [separate by space]: ')
        self.companies = input('Companies (default none) [separate by space]: ')
        self.gfg = input('GeeksforGeeks path [url path joined by dash]: ')
        self.hackerrank = input('Hackerrank path [url path joined by dash]: ')
        self.interviewbit = input('InterviewBit path [url path joined by dash]: ')
        if len(langs.strip()) == 0:
            langs = 'java'
        self.languages = langs.split(' ')
        self.time_complexity = format_complexity(tc)
        self.space_complexity = format_complexity(sc)

    def retrieve_question_data(self):
        response = requests.post(self.url, json={'query': question_query, 'variables': self.variable})
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
        topics = f"[{', '.join([tag['slug'] for tag in self.question_data['topicTags']])}]"
        difficulty = self.question_data['difficulty'].lower()
        languages = f"[{', '.join(self.languages)}]"
        return post_data_format.format(
            title=self.question_data['title'],
            difficulty=difficulty,
            topics=topics,
            leetcode_id=self.question_data['questionId'],
            tc=self.time_complexity,
            sc=self.space_complexity,
            languages=languages,
            companies=self.companies,
            gfg=self.gfg,
            hackerrank=self.hackerrank,
            interviewbit=self.interviewbit,
            content=content
        )

    def create_file(self, content, ext='md'):
        # difficulty_path = '_{}'.format(self.question_data['difficulty'].lower())
        file_name = os.path.join(self.root_path, 'posts', '_questions', self.question + '.' + ext)
        # print(file_name, content)
        os.makedirs(os.path.dirname(file_name), exist_ok=True)
        with open(file_name, 'w') as text_file:
            text_file.write(content)
        print(os.path.abspath(file_name))

    def create_solution_files(self):
        path = os.path.join(self.root_path, '_includes', 'code', self.question)
        for lang in self.languages:
            file_name = os.path.join(path, 'solution.{}'.format(lang))
            os.makedirs(os.path.dirname(file_name), exist_ok=True)
            with open(file_name, 'w') as text_file:
                text_file.write('')
            print(os.path.abspath(file_name))

    def generate_question(self):
        self.take_input()
        self.retrieve_question_data()
        post_data = self.create_post_data()
        print('Created following files::')
        self.create_file(post_data, 'md')
        self.create_solution_files()


if __name__ == '__main__':
    leetcode = Leetcode()
    leetcode.generate_question()
