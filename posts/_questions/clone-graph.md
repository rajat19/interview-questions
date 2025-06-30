---
layout: post
title: Clone Graph
topics: [depth-first-search, graph, hash-table]
langs: [java, cpp, py]
tc: O(n)
sc: O(n)
leetid: 133
difficulty: medium
companies: [google, facebook, amazon]
gfg: 
hackerrank: 
interviewbit: clone-graph
leetcode: clone-graph
---

Given a reference of a node in a connected undirected graph.

Return a deep copy (clone) of the graph.

Each node in the graph contains a value (int) and a list (`List[Node]`) of its neighbors.
```
class Node {
    public int val;
    public List<Node> neighbors;
}
```

Test case format:

For simplicity, each node's value is the same as the node's index (1-indexed). 
For example, the first node with `val == 1`, the second node with `val == 2`, and so on. 
The graph is represented in the test case using an adjacency list.

An adjacency list is a collection of unordered lists used to represent a finite graph. 
Each list describes the set of neighbors of a node in the graph.

The given node will always be the first node with `val = 1`. You must return the copy of the given node as a reference to the cloned graph.

---

## Test Cases

**Input:**
```
(Node) adjList = [[2,4],[1,3],[2,4],[1,3]]
```

**Output:**
```
(Node) [[2,4],[1,3],[2,4],[1,3]]
```

---

**Input:**
```
(Node) adjList = [[]]
```

**Output:**
```
(Node) [[]]
```

---

**Input:**
```
(Node) adjList = []
```

**Output:**
```
(Node) []
```