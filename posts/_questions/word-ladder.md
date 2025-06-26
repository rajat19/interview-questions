---
layout: post
title: Word Ladder
topics: [hash-table, string]
langs: [java, cpp]
tc: O(m<sup>2</sup>n)
sc: O(m<sup>2</sup>n)
leetid: 127
difficulty: hard
companies: [linkedin, facebook]
gfg: 
hackerrank: 
interviewbit: word-ladder-i
leetcode: word-ladder
---

A transformation sequence from word `beginWord` to word `endWord` using a dictionary `wordList` is a sequence of words 
```
beginWord -> s1 -> s2 -> ... -> sk
```
such that: 
- Every adjacent pair of words differs by a single letter. 
- Every s<sub>i</sub> for `1 <= i <= k` is in wordList. Note that beginWord does not need to be in wordList.
- `sk == endWord`

Given two words, `beginWord` and `endWord`, and a dictionary `wordList`, 
return the number of words in the shortest transformation sequence from `beginWord` to `endWord`, or `0` if no such sequence exists.

---
## Test Cases

**Input:**

    (String)    beginWord = "hit"
    (String)    endWord = "cog"
    (String[])  wordList = ["hot","dot","dog","lot","log","cog"]

**Output:**

      (int) 5

---

**Input:**

    (String)    beginWord = "hit"
    (String)    endWord = "cog"
    (String[])  wordList = ["hot","dot","dog","lot","log"]

**Output:**

      (int) 0