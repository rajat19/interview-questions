---
author: "Rajat Srivastava"
title: "Longest Substring Without Repeating Characters"
topics: "hash-table sliding-window string"
langs: "java py cpp ts"
tc: "O(n)"
sc: "O(26)"
leetid: 3
companies: "facebook"
difficulty: "medium"
date: 2025-06-18T01:15:27.896796
---

Given a string `s`, find the length of the longest substring without repeating characters.

---

## Test Cases

**Example 1:**
```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

**Example 2:**
```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

**Example 3:**
```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```