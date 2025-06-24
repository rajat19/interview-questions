---
layout: post
title: Rotate Array
topics: [array, two-pointers]
langs: [java, cpp, py]
tc: O(logn)
sc: O(1)
leetid: 189
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: rotate-array
---

Given an array, rotate the array to the right by k steps, where k is non-negative.

---

## Test Cases

**Example 1:** 
```
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```

**Example 2:** 
```
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```