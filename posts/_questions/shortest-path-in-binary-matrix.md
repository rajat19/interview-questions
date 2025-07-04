---
layout: post
title: Shortest Path in Binary Matrix
topics: [array, breadth-first-search, matrix]
langs: [java]
tc: O(1)
sc: O(1)
leetid: 1091
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: shortest-path-in-binary-matrix
---

Given an `n x n` binary matrix `grid`, return the length of the shortest clear path in the matrix. If there is no clear path, return `-1`.

A clear path in a binary matrix is a path from the top-left cell (i.e., (`0`, `0`)) to the bottom-right cell (i.e., (`n - 1`, `n - 1`)) such that:
- All the visited cells of the path are 0. 
- All the adjacent cells of the path are 8-directionally connected (i.e., they are different, and they share an edge or a corner).

The length of a clear path is the number of visited cells of this path.

---

## Test Cases

**Example 1:** 

{% include matrix.html rows=2 cols=2 matrix='0:$green,1,1,0:$green' %}
```
Input: grid = [[0,1],[1,0]]
Output: 2
```

**Example 2:**

{% include matrix.html rows=3 cols=3 matrix='0:$green,0:$green,0:$green,1,1,0:$green,1,1,0:$green' %}
```
Input: grid = [[0,0,0],[1,1,0],[1,1,0]]
Output: 4
```