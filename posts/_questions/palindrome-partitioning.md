---
layout: post
title: Palindrome Partitioning
topics: [backtracking, dynamic-programming, string]
langs: [java, py, cpp]
tc: O(n2<sup>n</sup>)
sc: O(n<sup>2</sup>)
leetid: 131
companies: [adobe, amazon, apple, bloomberg, facebook, goldman, google, microsoft, oracle, twitter]
difficulty: hard
gfg: 
hackerrank: 
interviewbit: 
leetcode: palindrome-partitioning
---

Given a string `s`, partition `s` such that every substring of the partition is a **palindrome**. 
Return all possible palindrome partitioning of `s`.

A palindrome string is a string that reads the same backward as forward.

---
## How to Solve

A given string `s` starting at index `start` and ending at index `end` is a palindrome if following conditions are satisfied :
1. The characters at `start` and `end` indexes are equal. 
2. The substring starting at index `start+1` and ending at index `end−1` is a palindrome.

![Palindrome]({{ site.github.url }}/assets/img/code/palindrome_dp.png)

Let `N` be the length of the string. 
To determine if a substring starting at index `start` and ending at index `end` is a palindrome or not, 
we use a 2 Dimensional array `dp` of size `NxN` where,

`dp[start][end]=true` , if the substring beginning at index `start` and ending at index `end` is a palindrome.

Otherwise, `dp[start][end] ==false`.

Also, we must update the `dp` array, if we find that the current string is a palindrome.

---
## Test Cases

**Example 1:**
```
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
```

**Example 2:**
```
Input: s = "a"
Output: [["a"]]
```