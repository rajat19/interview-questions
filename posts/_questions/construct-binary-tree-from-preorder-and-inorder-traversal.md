---
layout: post
title: Construct Binary Tree from Preorder and Inorder Traversal
topics: [array, binary-tree, divide-and-conquer, tree]
langs: [java, py, cpp]
tc: O(h)
sc: O(1)
leetid: 105
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: construct-binary-tree-from-preorder-and-inorder-traversal
---

Given two integer arrays `preorder` and `inorder` where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, 
construct and return the binary tree.

---

## Test Cases

**Example 1:** 
```
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

**Example 2:** 
```
Input: preorder = [-1], inorder = [-1]
Output: [-1]
```