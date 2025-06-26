---
layout: post
title: Word Break II
topics: [backtracking, dynamic-programming, hash-table, string]
langs: [java, py]
tc: O(2<sup>n</sup>)
sc: O(n)
leetid: 140
difficulty: hard
companies: [facebook]
gfg: 
hackerrank: 
interviewbit: word-break-ii
leetcode: word-break-ii
---
Given a string `s` and a dictionary of strings `wordDict`, 
add spaces in `s` to construct a sentence where each word is a valid dictionary word. 
Return all such possible sentences in any order.

**Note** that the same word in the dictionary may be reused multiple times in the segmentation.

---

## Test Cases

**Example 1:** 
```
Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
Output: ["cats and dog","cat sand dog"]
```

**Example 2:** 
```
Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
Explanation: Note that you are allowed to reuse a dictionary word.
```

**Example 3:**
```
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: []
```