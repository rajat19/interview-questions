---
layout: post
title: Lowest Common Ancestor of a Binary Tree
topics: [tree, depth-first-search, binary-tree]
langs: [java, py, cpp, c]
tc: O(n)
sc: O(h)
leetid: 236
companies: [adobe, amazon, facebook, microsoft, google]
difficulty: medium
gfg: lowest-common-ancestor-binary-tree-set-1
hackerrank: 
interviewbit: least-common-ancestor
leetcode: lowest-common-ancestor-of-a-binary-tree
---
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
According to the <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor" target="_blank">definition of LCA on Wikipedia</a>: “The lowest common ancestor is defined between two nodes `p` and `q` as the lowest node in `T` that has both `p` and `q` as descendants (where we allow <b>a node to be a descendant of itself</b>).”
 
---
## Test Cases
**Example 1:**
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/14/binarytree.png" style="width: 200px; height: 190px;" />
```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.
```
**Example 2:**
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/14/binarytree.png" style="width: 200px; height: 190px;" />
```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
```
**Example 3:**
```
Input: root = [1,2], p = 1, q = 2
Output: 1
```
 
**Constraints:**
	
* The number of nodes in the tree is in the range `[2, 10<sup>5</sup>]`.
	
* `-10<sup>9</sup> <= Node.val <= 10<sup>9</sup>`
	
* All `Node.val` are **unique**.
	
* `p != q`
	
* `p` and `q` will exist in the tree.

        