---
layout: post
title: Number of Islands
topics: [array, depth-first-search, breadth-first-search, union-find, matrix]
langs: [java, py, cpp]
tc: O(mn)
sc: O(1)
leetid: 200
companies: [google, facebook]
difficulty: medium
gfg: 
hackerrank: 
interviewbit: 
leetcode: number-of-islands
---
Given an `m x n` 2D binary grid `grid` which represents a map of `'1'`s (land) and `'0'`s (water), return *the number of islands*.
An **island** is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 
---
## Test Cases
**Example 1:**
```
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
```
**Example 2:**
```
Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
```
 
**Constraints:**
	
* `m == grid.length`
	
* `n == grid[i].length`
	
* `1 <= m, n <= 300`
	
* `grid[i][j]` is `'0'` or `'1'`.

        