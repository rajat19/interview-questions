---
layout: post
title: Matching Pairs
topics: [string]
langs: [java]
tc: O(n)
sc: O(n)
companies: 
difficulty: medium
gfg: 
hackerrank: 
interviewbit: 
leetcode: 
---

Given two strings s and t of length N, 
find the maximum number of possible matching pairs in strings s and t after swapping exactly two characters within s.

A swap is switching s[i] and s[j], 
where s[i] and s[j] denotes the character that is present at the ith and jth index of s, respectively. 
The matching pairs of the two strings are defined as the number of indices for which s[i] and t[i] are equal.

Note: This means you must swap two characters at different indices.

---

## Test Cases

**Example 1:** 
```
Input: s = "abcd" t = "adcb"
Output: 4
Explanation: Using 0-based indexing, and with i = 1 and j = 3, s[1] and s[3] can be swapped, making it  "adcb".
Therefore, the number of matching pairs of s and t will be 4.
```

**Output:** 
```
Input: s = "mno" t = "mno"
Output: 1
Explanation: Two indices have to be swapped, regardless of which two it is, only one letter will remain the same. 
If i = 0 and j=1, s[0] and s[1] are swapped, making s = "nmo", which shares only "o" with t.
```