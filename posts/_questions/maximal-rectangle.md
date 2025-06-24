---
layout: post
title: Maximal Rectangle
topics: [array, dynamic-programming, matrix, stack]
langs: [java, cpp]
tc: O(nm)
sc: O(m)
leetid: 85
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: maximal-rectangle
---

Given a `rows x cols` binary matrix filled with `0`'s and `1`'s, find the largest rectangle containing only `1`'s and return its area.

---

## Test Cases

**Example 1:**

{% include matrix.html rows=4 cols=5 matrix='1,0,1,0,0,1,0,1:$blue,1:$blue,1:$blue,1,1,1:$blue,1:$blue,1:$blue,1,0,0,1,0' %}

```
Input: grid = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
```