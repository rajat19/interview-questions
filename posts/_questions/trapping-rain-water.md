---
layout: post
title: Trapping Rain Water
topics: [array, stack, two-pointers]
langs: [java, go, c, cpp, py, js, ts, cs]
tc: O(n)
sc: O(1)
leetid: 42
gfg: trapping-rain-water
difficulty: hard
companies: [facebook, google, amazon, adobe]
hackerrank: 
interviewbit: container-with-most-water
leetcode: trapping-rain-water
---

Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining.

---
## Test Cases

**Example 1:**
![Rain Water]({{ site.github.url }}/assets/img/code/rainwatertrap.png)

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.
```

**Example 2:**
```
Input: height = [4,2,0,3,2,5]
Output: 9
```
