---
layout: post
title: The Skyline Problem
topics: [array, divide-and-conquer, heap]
langs: [java]
tc: O(nlogn)
sc: O(n)
leetid: 218
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: the-skyline-problem
---

A city's **skyline** is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance. 
Given the locations and heights of all the buildings, return the skyline formed by these buildings collectively.

The geometric information of each building is given in the array `buildings` where
<pre class="highlight">
<code>buildings[i] = [left<sub>i</sub>, right<sub>i</sub>, height<sub>i</sub>]</code>
</pre>


- left<sub>i</sub> is the `x` coordinate of the left edge of the ith building.
- right<sub>i</sub> is the `x` coordinate of the right edge of the ith building.
- height<sub>i</sub> is the height of the ith building.
You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at height 0.

The skyline should be represented as a list of "key points" sorted by their x-coordinate in the form `[[x1,y1],[x2,y2],...]`. 
Each key point is the left endpoint of some horizontal segment in the skyline except the last point in the list, 
which always has a y-coordinate 0 and is used to mark the skyline's termination where the rightmost building ends. 
Any ground between the leftmost and rightmost buildings should be part of the skyline's contour.

Note: There must be no consecutive horizontal lines of equal height in the output skyline. For instance, [...,[2 3],[4 5],[7 5],[11 5],[12 7],...] is not acceptable; the three lines of height 5 should be merged into one in the final output as such: [...,[2 3],[4 5],[12 7],...]

---

## Test Cases

**Input:** 
```
(int[][]) buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
```

**Output:** 
```
(int[][]) [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]
```