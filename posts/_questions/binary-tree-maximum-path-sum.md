---
layout: post
title: Binary Tree Maximum Path Sum
topics: [binary-tree, depth-first-search, dynamic-programming, tree]
langs: [java, py, cpp, ts]
tc: O(h)
sc: O(1)
leetid: 124
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: binary-tree-maximum-path-sum
---

A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The **path sum** of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any **non-empty** path.

---

## Test Cases

**Example 1:** 
```
Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
  -10
 /   \
9     20
     /  \
    15   7
```

**Example 2:** 
```
Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
  1
 / \ 
2   3
```