---
layout: post
title: Convert Binary Tree to DLL
topics: [binary-tree, linked-list, tree]
langs: [java]
tc: O(n)
sc: O(h)
leetid: 
difficulty: medium
companies: [amazon, microsoft, facebook, salesforce]
gfg: convert-binary-tree-to-doubly-linked-list-using-inorder-traversal
hackerrank: 
interviewbit: 
leetcode: convert-binary-tree-to-dll
---

Given a Binary Tree (BT), the task is to convert it to a Doubly Linked List (DLL) in place. The left and right pointers in nodes will be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be the same as the order of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.

---
## Test Cases
**Example 1:**

```
Input:
      1
    /  \
   3    2
Output:
3 1 2 
2 1 3
```

**Example 2:**
```
Input:
       10
      /   \
     20   30
   /   \
  40   60
Output:
40 20 60 10 30 
30 10 60 20 40
```