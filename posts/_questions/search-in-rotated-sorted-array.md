---
layout: post
title: Search in Rotated Sorted Array
topics: [array, two-pointers]
langs: [java, go, cpp, py, c]
tc: O(n)
sc: O(n)
leetid: 33
gfg: search-an-element-in-a-sorted-and-pivoted-array
companies: [facebook]
difficulty: medium
hackerrank: 
interviewbit: rotated-sorted-array-search
leetcode: search-in-rotated-sorted-array
---

There is an integer array `nums` sorted in ascending order (with distinct values).

Prior to being passed to your function, 
nums is possibly rotated at an unknown pivot index `k (1 <= k < nums.length)` 
such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0],nums[1], ..., nums[k-1]]` (0-indexed). 
For example, `[0,1,2,4,5,6,7]` might be rotated at pivot index 3 and become `[4,5,6,7,0,1,2]`.

Given the array nums after the possible rotation and an integer `target`, return the index of target if it is in `nums`, or `-1` if it is not in nums.

---

## Test Cases

**Input:**
```
(int[]) nums = [4,5,6,7,0,1,2]
(int) target = 0
```

**Output:**
```
(int) 4
```

---

**Input:**
```
(int[]) nums = [4,5,6,7,0,1,2]
(int) target = 3
```

**Output:**
```
(int) -1
```