---
layout: post
title: Burning Tree
topics: [binary-tree, breadth-first-search, queue, tree]
langs: [java]
tc: O(n)
sc: O(2<sup>h</sup>)
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: 
---

Given a binary tree and target node. By giving the fire to the target node and fire starts to spread in a complete tree. 
The task is to print the total time to burn every node of the binary tree

Rules for burning the nodes :
1. Fire will spread constantly to the connected nodes only.
2. Every node takes the same time to burn.
3. A node burns only once.

---

## Test Cases

![Burn Tree]({{ site.github.url }}/assets/img/code/binarytree.jpeg)

**Input:**

```
(TreeNode)  root = [5,3,6,2,4,null,null,1]
(int)       target = 4
```

**Output:**
```
(int) 4
```

**Explanation**
```
Step 1: burn 4
Step 2: burn 3
Step 3: burn 2, 5
Step 4: burn 1, 6
```

---

**Input:**

```
(TreeNode)  root = [5,3,6,2,4,null,null,1]
(int)       target = 3
```

**Output:**
```
(int) 3
```

**Explanation**
```
Step 1: burn 3
Step 2: burn 2,4,5
Step 3: burn 1, 6
```