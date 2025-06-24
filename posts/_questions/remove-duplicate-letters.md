---
layout: post
title: Remove Duplicate Letters
topics: [greedy, stack, string]
langs: [java, py]
tc: O(n)
sc: O(n)
leetid: 316
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: remove-duplicate-letters
---

Given a string `s`, remove duplicate letters so that every letter appears once and only once. 
You must make sure your result is **the smallest in lexicographical order** among all possible results.

---
## How to Solve

1. Store occurrences of every character
2. For every character in string, do following-
   1. decrement number of characters remaining in the string to be analysed
   2. if character is already present in stack, don't bother
   3. if current character is smaller than last character in stack which occurs later in the string again, 
      it can be removed and  added later e.g. stack = bc remaining string abc then a can pop b and then c
   4. add current character in stack and mark it as visited
3. pop character from stack and build answer string from back

---

## Test Cases

**Example 1:** 
```
Input: s = "bcabc"
Output: "abc"
```

**Example 2:** 
```
Input: s = "cbacdcbc"
Output: "acdb"
```