---
layout: post
author: Rajat Srivastava
title: Maximum Width of Binary Tree
tags: binary-tree depth-first-search tree
langs: java
tc: O(h)
sc: O(1)
leetid: 662
---

Given the root of a binary tree, return the **_maximum width_** of the given tree.

The **maximum width** of a tree is the maximum width among all levels.

The **width** of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes are also counted into the length calculation.

It is guaranteed that the answer will in the range of 32-bit signed integer.

---

## Test Cases

**Input:** 
```
(TreeNode) root = [1,3,2,5,3,null,9]
```

**Output:** 
```
(int) 4
```

**Explanation:**
```
The maximum width existing in the third level with the length 4 (5,3,null,9).
    1
   / \
  3   2
 / \   \
5   3   9
```

---

**Input:**
```
(TreeNode) root = [1,3,2,5]
```

**Output:**
```
(int) 2
```

**Explanation:**
```
The maximum width existing in the second level with the length 4 (3, 2).
    1
   / \
  3   2
 /
5
```