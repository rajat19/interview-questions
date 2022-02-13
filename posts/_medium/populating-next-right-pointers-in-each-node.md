---
layout: post
author: Rajat Srivastava
title: Populating Next Right Pointers in Each Node
tags: linked-list tree
langs: java go py
tc: O(h)
sc: O(1)
leetid: 116

---

You are given a perfect binary tree where all leaves are on the same level, and **every parent has two children**. 
The binary tree has the following definition:
```java
class Node {
    int val;
    Node left;
    Node right;
    Node next;
}
```
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to `NULL`.

Initially, all next pointers are set to `NULL`.

---
## How to Solve

To solve, we will be traversing the tree per level.
For each node `curr` on a particular level (would already have `next` pointer due to parent level), do following
1. if `curr.left` is not null, point its next to `curr.right`
2. if `curr.right` is not null, point its next to `curr` neighbouring child
3. `curr = curr.next`

For next level, move to `level.left`

---
## Test Cases

![Example]({{ site.github.url }}/assets/img/code/116_sample.png)

**Input:**

    (Node) root = [1,2,3,4,5,6,7]

**Output:**

    (Node) [1,#,2,3,#,4,5,6,7,#]
