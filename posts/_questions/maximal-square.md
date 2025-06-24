---
layout: post
title: Maximal Square
topics: [array, dynamic-programming, matrix]
langs: [java]
tc: O(mn)
sc: O(mn)
leetid: 221
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: maximal-square
---

Given an `m x n` binary matrix filled with `0`'s and `1`'s, find the largest square containing only `1`'s and return its area.

---

## Test Cases

**Example 1:**

{% include matrix.html rows=5 cols=5 matrix='1,0,1,0,0,10,1,1:$green,1:$green,1,1,1,1:$green,1:$green,1,0,0,1,0' %}

```
Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 4

```

**Example 2:** 

{% include matrix.html rows=2 cols=2 matrix='0,1:$green,1:$red,0' %}

```
Input: matrix = [["0","1"],["1","0"]]
Output: 1
```