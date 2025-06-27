---
layout: post
title: Serialize and Deserialize Binary Tree
topics: [string, tree, depth-first-search, breadth-first-search, design, binary-tree]
langs: [java, py]
tc: O(n)
sc: O(n)
leetid: 297
companies: [facebook, google, linkedin, uber]
difficulty: hard
gfg: 
hackerrank: 
interviewbit: 
leetcode: serialize-and-deserialize-binary-tree
---
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 
---
## Test Cases
**Example 1:**
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/15/serdeser.jpg" style="width: 442px; height: 324px;" />
```
Input: root = [1,2,3,null,null,4,5]
Output: [1,2,3,null,null,4,5]
```

**Example 2:**
```
Input: root = []
Output: []
```

**Constraints:**
* The number of nodes in the tree is in the range `[0, 10<sup>4</sup>]`.
* `-1000 <= Node.val <= 1000`

        