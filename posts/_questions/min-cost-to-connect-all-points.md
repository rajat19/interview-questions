---
layout: post
title: Min Cost to Connect All Points
topics: [array, graph]
langs: [java]
tc: O(1)
sc: O(1)
leetid: 1584
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: min-cost-to-connect-all-points
---

You are given an array points representing integer coordinates of some points on a 2D-plane, where `points[i] = [xi, yi]`.

The cost of connecting two points `[xi, yi]` and `[xj, yj]` is the manhattan distance between them: 
```|xi - xj| + |yi - yj|```
where `|val|` denotes the absolute value of `val`.

Return the minimum cost to make all points connected. All points are connected if there is **exactly one** simple path between any two points.

---

## Test Cases

**Example 1:** 

<div style="background-color: white; width: auto">
    <img src="{{ site.github.url }}/assets/img/code/min-cost.png" alt="">
    <img src="{{ site.github.url }}/assets/img/code/min-cost2.png" alt="">
</div>

```
Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
Output: 20
Explanation: 

We can connect the points as shown above to get the minimum cost of 20.
Notice that there is a unique path between every pair of points.
```

**Example 2:** 
```
Input: points = [[3,12],[-2,5],[-4,1]]
Output: 18
```