---
layout: post
title: Maximum Width of Binary Tree
topics: [binary-tree, depth-first-search, tree]
langs: [java, py]
tc: O(h)
sc: O(1)
leetid: 662
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: maximum-width-of-binary-tree
---

Given the root of a binary tree, return the **_maximum width_** of the given tree.

The **maximum width** of a tree is the maximum width among all levels.

The **width** of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes are also counted into the length calculation.

It is guaranteed that the answer will in the range of 32-bit signed integer.

---

## Test Cases

**Example 1:** 
```
Input: root = [1,3,null,5,3]
Output: 2
Explanation: The maximum width existing in the third level with the length 2 (5,3).
    1
   / \
  3   2
 / \   \
5   3   9
```

**Example 2:** 
```
Input: root = [1,3,2,5]
Output: 2
Explanation: The maximum width existing in the second level with the length 2 (3,2).
    1
   / \
  3   2
 /
5
```
