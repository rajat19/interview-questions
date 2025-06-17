---
author: "Rajat Srivastava"
title: "Single Number II"
topics: "array bit-manipulation"
langs: "java cpp"
tc: "O(n)"
sc: "O(1)"
leetid: 137
companies: None
difficulty: "medium"
date: 2025-06-18T01:15:27.912089
---
Given an integer array `nums` where every element appears **three times** except for one, which appears **exactly once**. *Find the single element and return it*.
You must implement a solution with a linear runtime complexity and use only constant extra space.
 
---
## Test Cases
**Example 1:**
```
Input: nums = [2,2,3,2]
Output: 3
```

**Example 2:**
```
Input: nums = [0,1,0,1,0,1,99]
Output: 99
```
 
**Constraints:**
	
* `1 <= nums.length <= 3 * 10<sup>4</sup>`
	
* `-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1`
	
* Each element in `nums` appears exactly **three times** except for one element which appears **once**.

        