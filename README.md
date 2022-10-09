# Interview Questions

![Languages count](https://img.shields.io/github/languages/count/rajat19/interview-questions.svg?style=for-the-badge)
![Top Language](https://img.shields.io/github/languages/top/rajat19/interview-questions.svg?style=for-the-badge)
![License](https://img.shields.io/github/license/rajat19/interview-questions?style=for-the-badge)
![Last Commit](https://img.shields.io/github/last-commit/rajat19/interview-questions?style=for-the-badge)

A collection of top interview questions asked in DSA rounds of companies. The project is build over jekyll.

The project contains solutions of the questions in multiple languages, the questions are also tagged with topics and companies.

Website: [interview-questions](https://rajat19.github.io/interview-questions/)

![Screenshot](assets/img/global/ss.png)

![Screenshot](assets/img/global/ss2.png)

Questions are present inside [posts](/posts) folder, with their working solutions available in [code](_includes/code) folder

### Sample coding question post [hello-world.md](/hello-world.md)

```markdown
---
layout: post
author: Rajat Srivastava
title: Hello World
topics: string
langs: java py c cpp go js php cs rb rust scala kt
tc: O(1)
sc: O(1)
leetid: 0
---

Print Hello appended by input string

---

## Test Cases

**Input:** 
	
	(string) s = "World"

**Output:** 

	(string) "Hello World"
```

### Setup:
The project is build over `jekyll`

To start the project
1. Install ruby
2. Install bundles using 
   ```shell
    bundle install
    ```
3. Start project using
   ```shell 
   jekyll serve
   ```

### TODO:
1. Add solutions in most major languages
2. Add `main` method in solutions so that we can test them out
3. Run solutions using [test.sh](/test.sh)
4. Add company tags
5. Add GFG, Leetcode, Interviewbit etc. links for preparation and testing out code