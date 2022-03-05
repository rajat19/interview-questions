
# Contributing

Contributions are welcome, and they are greatly appreciated! Every
little bit helps, and credit will always be given.

You can contribute in many ways:

## Types of Contributions
----------------------

### Report Errors in Solutions
Report errors on the `issues page`. If you are reporting an issue, please include:

* Question for which issue came
* Language in which the code is not working

### Fix Solutions
All the solutions available in the website at time of their creation are correct. 
But questions' language might change later and their solution might need to be updated/corrected.
Look through the GitHub issues for some wrong solutions. Anything tagged with "bug"
is open to whoever wants to implement it.

### Add Solutions
Add your solution in any language. Please add the language in `langs` front matter for your post

### Add Foobar Questions
You can add any question you want available on leetcode. Check [Sample](posts/_sample/hello-world.md) on how to add a question with its solutions

## Get Started!
------------
Ready to contribute? Here's how to set up `foobar` for local.

1. Fork the `foobar` repo on GitHub.
2. Clone your fork locally::
```bash
    $ git clone git@github.com:rajat19/interview-questions.git
```
3. Create a branch for local development::
```bash
    $ git checkout -b name-of-your-bugfix-or-feature
```

4. Commit your changes, quoting github issue in the commit message, if applicable and push your branch to GitHub::
```bash
    $ git add .
    $ git commit -m "Fix #XX - My awesome fix"
    $ git push origin name-of-your-bugfix-or-feature
```

5. Submit a pull request through the GitHub website.

## Things to keep in mind!
---
Some things to keep in mind while adding questions/solutions-
1. Questions and test cases are added in `markdown` files which have .md extensions. These are added in [posts](posts) folder under their difficulty tab
Have the following front matter for your post
```markdown
---
layout: post
author: <AUTHOR_NAME>
title: <QUESTION_NAME>
topics: <QUESTION_TYPE>
langs: <SUPPORTED_LANGUAGES>
leetcode: <LEETCODE_LINK>
tc: <TIME_COMPLEXITY>
sc: <SPACE_COMPLEXITY
leetid: <LEETCODE_ID>
---
```
2. The solutions are added in [_includes/code](_includes/code) folder. Add a folder with question name ex- `got-interesting`. Add your solutions in this folder only.
3. By default, the langs required are defined in `enabled_languages` in [_config.yml](_config.yml). 
Update langs for your solution, only that would be read in `code` folder
