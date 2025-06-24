---
layout: post
title: Palindrome Partitioning II
topics: [dynamic-programming, string]
langs: [java, cpp]
tc: O(n<sup>2</sup>)
sc: O(n<sup>2</sup>)
leetid: 132
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: palindrome-partitioning-ii
---

Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of `s`.

---

## Test Cases

**Example 1:** 
```
Input: s = "aab"
Output: 1
Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.
```

**Example 2:**
```
Input: s = "abaa"
Output: 1
Explanation: The palindrome partitioning ["aba","a"] could be produced using 1 cut.
```