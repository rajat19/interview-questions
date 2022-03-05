---
layout: post
author: Rajat Srivastava
title: Longest Palindromic Substring
topics: string dynamic-programming
langs: java go py
tc: O(n<sup>2</sup>)
sc: O(1)
leetid: 5

---

Given a string s, return the longest palindromic substring in s.

---
## How to Solve

We observe that a palindrome mirrors around its center. 
Therefore, a palindrome can be expanded from its center, and there are only `2n - 1` such centers.
The reason is the center of a palindrome can be in between two letters. 
Such palindromes have even number of letters (such as "abba") and its center are between the two 'b's.

---
## Test Cases

**Input:**

    (String) s = "babad"

**Output:**

    (String) bab

---

**Input:**

    (String) s = "abacdfgdcaba"

**Output:**

    (String) aba