---
layout: post
title: House Robber III
topics: [binary-tree, depth-first-search, dynamic-programming, tree]
langs: [java, py, cpp]
tc: O(n)
sc: O(1)
leetid: 337
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: house-robber-iii
---

The thief has found himself a new place for his thievery again. There is only one entrance to this area, called `root`.

Besides the `root`, each house has one and only one parent house. 
After a tour, the smart thief realized that all houses in this place form a binary tree. 
It will automatically contact the police if **two directly-linked houses were broken into on the same night**.

Given the `root` of the binary tree, return the maximum amount of money the thief can rob without alerting the police.

---

## Test Cases

**Input:** 
```
(TreeNode) root = [3,2,3,null,3,null,1]
```

**Output:** 
```
(int) 7
```

**Explanation:**
```
    3
   / \
  2   3
   \   \
    3   1

Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
```