---
layout: post
title: Kth Smallest Element in a BST
topics: [binary-tree, binary-search-tree, depth-first-search, tree]
langs: [java, py, cpp]
tc: O(h+k)
sc: O(h)
leetid: 230
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: kth-smallest-element-in-a-bst
---

Given the root of a binary search tree, and an integer k, return the k<sup>th</sup> smallest value (1-indexed) of all the values of the nodes in the tree.

---
## Test Cases

**Example 1:**
```
Input: root = [3,1,4,null,2], k = 1
Output: 1
Explanation:
   3
  / \
 1   4
  \
   2
```

**Example 2:**
```
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
Explanation:
      5
     / \
    3   6
   / \
  2   4
 /    
1
```