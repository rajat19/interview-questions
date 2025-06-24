---
layout: post
title: Course Schedule II
topics: [depth-first-search, graph, topological-sort]
langs: [java, py]
tc: O(V+E)
sc: O(V+E)
leetid: 210
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: course-schedule-ii
---

There are a total of numCourses courses you have to take, labeled from `0` to `numCourses - 1`. 
You are given an array prerequisites where prerequisites[i] = [a<sub>i</sub>, b<sub>i</sub>]
indicates that you must take course b<sub>i</sub> first if you want to take course a<sub>i</sub>.

For example, the pair `[0, 1]`, indicates that to take course `0` you have to first take course `1`.
Return the ordering of courses you should take to finish all courses. 
If there are many valid answers, return any of them. 
If it is impossible to finish all courses, return an empty array.

---
## How to Solve

*The first node in the topological ordering will be the node that doesn't have any incoming edges. 
Essentially, any node that has an in-degree of 0 can start the topologically sorted order. 
If there are multiple such nodes, their relative order doesn't matter, and they can appear in any order.*

1. Initialize a queue, Q to keep a track of all the nodes in the graph with 0 in-degree. 
2. Iterate over all the edges in the input and create an adjacency list and also a map of node v/s in-degree. 
3. Add all the nodes with 0 in-degree to Q. 
4. The following steps are to be done until the Q becomes empty. 
   1. Pop a node from the Q. Let's call this node, N. 
   2. For all the neighbors of this node, N, reduce their in-degree by 1. If any of the nodes' in-degree reaches 0, add it to the Q. 
   3. Add the node N to the list maintaining topologically sorted order. 
   4. Continue from step `4.1`.

---

## Test Cases

**Input:** 
```
(int) numCourses = 2
(int[]) prerequisites = [[1,0]]
```

**Output:** 
```
(int[]) [0, 1]
```

**Explanation:**
```
There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So the correct course order is [0,1].
```

---

**Input:** 
```
(int) numCourses = 4
(int[]) prerequisites = [[1,0],[2,0],[3,1],[3,2]]
```

**Output:** 
```
(int[]) [0,2,1,3]
```

**Explanation:**
```
There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].
```