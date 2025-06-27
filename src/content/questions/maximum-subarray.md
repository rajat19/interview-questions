---
author: "Rajat Srivastava"
title: "Maximum Subarray"
topics: "array divide-and-conquer dynamic-programming"
langs: "java cpp py go"
tc: "O(n)"
sc: "O(n)"
leetid: 53
companies: None
difficulty: "medium"
date: 2025-06-18T01:15:27.892806
---
Given an integer array `nums`, find the <span data-keyword="subarray-nonempty">subarray</span> with the largest sum, and return *its sum*.
 
---
## Test Cases
**Example 1:**
```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
```
**Example 2:**
```
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
```
**Example 3:**
```
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
```
 
**Constraints:**
	
* `1 <= nums.length <= 10<sup>5</sup>`
	
* `-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>`
 
**Follow up:** If you have figured out the `O(n)` solution, try coding another solution using the **divide and conquer** approach, which is more subtle.

        