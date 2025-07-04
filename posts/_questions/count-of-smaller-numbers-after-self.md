---
layout: post
title: Count of Smaller Numbers After Self
topics: [array, divide-and-conquer, sorting]
langs: [java, cpp]
tc: O(nlogn)
sc: O(n)
leetid: 315
gfg: count-smaller-elements-on-right-side
companies: [facebook]
difficulty: hard
hackerrank: 
interviewbit: 
leetcode: count-of-smaller-numbers-after-self
---

You are given an integer array `nums` and you have to return a new `counts` array. 
The `counts` array has the property where `counts[i]` is the number of smaller elements to the right of `nums[i]`.

---

## Test Cases

**Example 1:** 
```
Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
```

**Example 2:** 
```
Input: nums = [-1,-1]
Output: [0,0]
```