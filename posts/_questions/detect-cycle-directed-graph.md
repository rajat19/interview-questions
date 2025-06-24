---
layout: post
title: Detect Cycle Directed Graph
topics: [graph]
langs: [java]
tc: O(V+E)
sc: O(V)
gfg: detect-cycle-in-a-graph
difficulty: medium
companies: 
hackerrank: 
interviewbit: 
leetcode: 
---

Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, check whether it contains any cycle or not.

---

## How to Solve

1. Create the graph using the given number of edges and vertices. 
2. Create a recursive function that initializes the current index or vertex, visited, and recursion stack. 
3. Mark the current node as visited and also mark the index in recursion stack. 
4. Find all the vertices which are not visited and are adjacent to the current node. Recursively call the function for those vertices, If the recursive function returns true, return true. 
5. If the adjacent vertices are already marked in the recursion stack then return true. 
6. Create a wrapper class, that calls the recursive function for all the vertices and if any function returns true return true. Else if for all vertices the function returns false, return false.

---

## Test Cases

**Example 1:** 
```
Input: V=4 adj=[[1],[2],[3],[3]]
Output: true
Explanation: 1->2->3->3 is cycle
```

**Example 2:** 
```
Input: V=4 adj=[[1],[2],[]]
Output: false
```