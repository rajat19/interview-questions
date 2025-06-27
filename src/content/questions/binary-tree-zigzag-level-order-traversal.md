---
author: "Rajat Srivastava"
title: "Binary Tree Zigzag Level Order Traversal"
topics: "binary-tree breadth-first-search tree"
langs: "java js py cpp"
tc: "O(n)"
sc: "O(n)"
leetid: 103
difficulty: "medium"
date: 2025-06-18T01:15:27.902779
---

Given the `root` of a binary tree, 
return the zigzag level order traversal of its nodes' values. 
(i.e., from left to right, then right to left for the next level and alternate between).

---

## Test Cases

**Input:** 
```
(TreeNode) root = [3,9,20,null,null,15,7]
```

**Output:** 
```
(int[]) [[3],[20,9],[15,7]]
```

**Explanation:**
```
    3
   / \
  9   20
     /  \
    15   7
```