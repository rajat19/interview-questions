---
layout: post
author: Rajat Srivastava
title: Minimum Window Substring
category: hard
tags: hashtable
langs: java
tc: O(n+m)
sc: O(n+m)
leetid: 76

---

Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

A substring is a contiguous sequence of characters within the string.

---
## How to Solve

The question asks us to return the minimum window from the string `S` which has all the characters of the string `T`. 
Let us call a window desirable if it has all the characters from `T`.

We can use a simple sliding window approach to solve this problem.
In any sliding window based problem we have two pointers. One `right` pointer whose job is to expand the current window, 
and then we have the `left` pointer whose job is to contract a given window. 
At any point in time only one of these pointers move and the other one remains fixed.

The solution is pretty intuitive. We keep expanding the window by moving the right pointer. 
When the window has all the desired characters, we contract (if possible) and save the smallest window till now.

The answer is the smallest desirable window.

---
## Test Cases

**Input:**

    (String) s = "ADOBECODEBANC"
    (String) t = "ABC"

**Output:**

      (String) "BANC"

**Explanation**

    The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

---

**Input:**

    (String) s = "a"
    (String) t = "aa"

**Output:**

      (String) ""

**Explanation**

    Both 'a's from t must be included in the window. Since the largest window of s only has one 'a', return empty string.
