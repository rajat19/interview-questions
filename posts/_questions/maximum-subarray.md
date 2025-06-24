---
layout: post
title: Maximum Subarray
topics: [array, divide-and-conquer, dynamic-programming]
langs: [java, cpp, py, go]
tc: O(n)
sc: O(n)
leetid: 53
companies: [facebook]
gfg: find-subarray-with-given-sum
difficulty: medium
hackerrank: 
interviewbit: 
leetcode: maximum-subarray
---
Given an integer array `nums`, find the `subarray` with the largest sum, and return *its sum*.
 
---
## How to Solve:

The idea of Kadane's algorithm is to traverse over the array from left to right and for each element, 
find the maximum sum among all subarrays ending at that element. The result will be the maximum of all these values.

But, the main issue is how to calculate maximum sum among all the subarrays ending at an element in O(N) time?

To calculate the maximum sum of subarray ending at current element, say maxEnding, 
we can use the maximum sum ending at the previous element. So for any element, we have two choices:

* Choice 1: Extend the maximum sum subarray ending at the previous element by adding the current element to it. 
If the maximum subarray sum ending at the previous index is positive, then it is always better to extend the subarray.
* Choice 2: Start a new subarray starting from the current element. 
* If the maximum subarray sum ending at the previous index is negative, 
* it is always better to start a new subarray from the current element.

This means that maxEnding at index `i = max(maxEnding at index (i - 1) + arr[i], arr[i])` 
and the maximum value of `maxEnding` at any index will be our answer.

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

        