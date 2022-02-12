---
layout: post
author: Rajat Srivastava
title: Kth Smallest Element in a BST
tags: backtracking dynamic-programming string
langs: java py
tc: O(h+k)
sc: O(h)
leetid: 230

---

Given the root of a binary search tree, and an integer k, return the k<sup>th</sup> smallest value (1-indexed) of all the values of the nodes in the tree.

---
## Test Cases

**Input:**

![Kth Tree]({{ site.github.url }}/assets/img/code/kthtree2.jpeg)

    (TreeNode)  root = [5,3,6,2,4,null,null,1]
    (int)       k = 3

**Output:**

    (int) 3 
