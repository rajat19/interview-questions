---
layout: post
title: Longest Increasing Path in a Matrix
topics: [depth-first-search, dynamic-programming, graph]
langs: [java, cpp]
tc: O(4<sup>mn</sup>)
sc: O(mn)
leetid: 329
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: longest-increasing-path-in-a-matrix
---

Given an `m` x `n` integers `matrix`, return the length of the longest increasing path in `matrix`.

From each cell, you can either move in four directions: left, right, up, or down. 
You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).

---

## Test Cases

**Example 1:**

{% include matrix.html rows=3 cols=3 matrix='9:$green,9,4,6:$green,6,8,2:$green,1:$green,1' %}
```
Input: matrix = [[9,9,4],[6,6,8],[2,1,1]]
Output: 4
Explanation: The longest increasing path is [1, 2, 6, 9].
```

**Example 2:**

{% include matrix.html rows=3 cols=3 matrix='3:$green,4:$green,5:$green,3,2,6:$green,2,2,1' %}
```
Input: matrix = [[3,4,5],[3,2,6],[2,2,1]]
Output: 4
Explanation: The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
```