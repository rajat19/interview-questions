---
layout: post
title: Minimum Size Subarray Sum
difficulty: medium
topics: [array, binary-search, sliding-window, prefix-sum]
langs: [java, cpp]
tc: O(n)
sc: O(1)
companies: [facebook]
leetid: 209
leetcode: minimum-size-subarray-sum
gfg: 
interviewbit: 
hackerrank: 
---
Given an array of positive integers `nums` and a positive integer `target`, return *the **minimal length** of a *<span data-keyword="subarray-nonempty">*subarray*</span>* whose sum is greater than or equal to* `target`. If there is no such subarray, return `0` instead.
 
---
## Test Cases
**Example 1:**
```
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
```

**Example 2:**
```
Input: target = 4, nums = [1,4,4]
Output: 1
```

**Example 3:**
```
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
```
 
**Constraints:**
* `1 <= target <= 10<sup>9</sup>`
* `1 <= nums.length <= 10<sup>5</sup>`
* `1 <= nums[i] <= 10<sup>4</sup>`

**Follow up:** If you have figured out the `O(n)` solution, try coding another solution of which the time complexity is `O(n log(n))`.
