---
author: "Rajat Srivastava"
title: "Word Break"
topics: "string dynamic-programming"
langs: "java cpp py"
tc: "O(n<sup>2</sup>)"
sc: "O(n)"
leetid: 139
difficulty: "medium"
date: 2025-06-18T01:15:27.921090
---

Given a string s and a dictionary of strings `wordDict`, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

---
## Test Cases

**Input:**

    (String)    s = "leetcode"
    (String[])  wordDict = ["leet","code"]

**Output:**

    (boolean) true

---

**Input:**

    (String)    s = "applepenapple"
    (String[])  wordDict = ["apple","pen"]

**Output:**

    (boolean) true

**Explanation**

    Return true because "applepenapple" can be segmented as "apple pen apple". Note that you are allowed to reuse a dictionary word.

---

**Input:**

    (String)    s = "catsandog"
    (String[])  wordDict = ["cats","dog","sand","and","cat"]

**Output:**

    (boolean) false