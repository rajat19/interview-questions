---
layout: post
title: Max Area of Island
topics: [array, depth-first-search, matrix]
langs: [java, cpp]
tc: O(nm)
sc: O(1)
leetid: 695
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: max-area-of-island
---

You are given an `m` x `n` binary matrix `grid`. An island is a group of `1`'s (representing land) connected
4-directionally (horizontal or vertical.)
You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value `1` on the island.

Return the maximum area of an island in `grid`. If there is no island, return `0`.

---

## Test Cases

**Example 1:**

{% include matrix.html rows=8 cols=13 matrix='0,0,1:$blue,0,0,0,0,1:$blue,0,0,0,0,0,0,0,0,0,0,0,0,1:$blue,1:$blue,1:$blue,0,0,0,0,1:$blue,1:$blue,0,1:$blue,0,0,0,0,0,0,0,0,0,1:$blue,0,0,1:$blue,1:$blue,0,0,1:$green,0,1:$green,0,0,0,1:$blue,0,0,1:$blue,1:$blue,0,0,1:$green,1:$green,1:$green,0,0,0,0,0,0,0,0,0,0,0,0,1:$green,0,0,0,0,0,0,0,0,0,1:$blue,1:$blue,1:$blue,0,0,0,0,0,0,0,0,0,0,1:$blue,1:$blue,0,0,0,0' %}

```
Input: grid = 
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
[0,0,0,0,0,0,0,1,1,1,0,0,0],
[0,1,1,0,1,0,0,0,0,0,0,0,0],
[0,1,0,0,1,1,0,0,1,0,1,0,0],
[0,1,0,0,1,1,0,0,1,1,1,0,0],
[0,0,0,0,0,0,0,0,0,0,1,0,0],
[0,0,0,0,0,0,0,1,1,1,0,0,0],
[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.
```

**Example 2:**

```
Input: grid = [[0,0,0,0,0,0,0,0]]
Output: 0
```