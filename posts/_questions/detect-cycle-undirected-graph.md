---
layout: post
title: Detect Cycle Undirected Graph
topics: [graph]
langs: [java]
tc: O(V+E)
sc: O(V)
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: 
---

Given an undirected graph with V vertices and E edges, check whether it contains any cycle or not.

---

## How to Solve

1. Create the graph using the given number of edges and vertices.
2. Create a recursive function that have current index or vertex, visited array and parent node. 
3. Mark the current node as visited . 
4. Find all the vertices which are not visited and are adjacent to the current node. Recursively call the function for those vertices, If the recursive function returns true return true.
5. If the adjacent node is not parent and already visited then return true. 
6. Create a wrapper class, that calls the recursive function for all the vertices and if any function returns true, return `true`. 
7. Else if for all vertices the function returns false, return `false`.

---

## Test Cases

**Example 1:** 
```
Input: V=5 adj=[[1],[2,4],[1,3],[2,4],[1,3]]
Output: true
Explanation: 1->2->3->4->1 is cycle
```

**Example 2:** 
```
Input: V=4 adj=[[],[2],[1,3],[2]]
Output: false
```