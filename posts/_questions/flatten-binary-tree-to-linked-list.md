---
layout: post
title: Flatten Binary Tree to Linked List
topics: [binary-tree, depth-first-search, linked-list, tree]
langs: [java, cpp, c, py]
tc: O(n)
sc: O(n)
leetid: 114
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: flatten-binary-tree-to-linked-list
---

Given the root of a binary tree, flatten the tree into a "linked list":
- The "linked list" should use the same `TreeNode` class where the `right` child pointer points to the next node in the list and the `left` child pointer is always null.
- The "linked list" should be in the same order as a pre-order traversal of the binary tree.

---

## Test Cases

**Example 1:**

```
Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]
Explanation:
     1
    / \
   2   5
  / \   \
 3   4   6

changes to

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
```

**Example 2:** 
```
Input: root = []
Output: []
```