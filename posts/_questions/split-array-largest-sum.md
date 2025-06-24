---
layout: post
title: Split Array Largest Sum
topics: [array, dynamic-programming, greedy]
langs: [java]
tc: O(n<sup>2</sup>m)
sc: O(nm)
leetid: 410
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: split-array-largest-sum
---

Given an array nums which consists of non-negative integers and an integer `m`, 
you can split the array into `m` non-empty continuous subarrays.

Write an algorithm to minimize the largest sum among these `m` subarrays.

---

## How to Solve

1. Fill the array `prefixSum`. The i<sup>th</sup> index of `prefixSum` will have the sum of integers in nums in the range `[0, i - 1]` with `prefix[0] = 0`.
2. Initialize an array memo where `memo[currIndex][subarrayCount]` will store the result for the subproblem `(currIndex, subarrayCount)`. 
3. We need to find the value of `memo[0][m]` which represents the minimum largest subarray sum starting at index `0` with `m` subarrays. 
   1. But we only know what the result will be for the base cases. 
   2. To fill the memo array, we will iterate subarrayCount over the range `[1, m]` (starting at `1` because that is our base case) and iterate `currIndex` over the range `[0, n - 1]`.
4. For each value of `subarrayCount` and `currIndex`, we will update `memo[subarrayCount][currIndex]`:
   1. As the sum of the elements between `currIndex` and the end of the array if we are at a base case (`subarrayCount` equals 1).
   2. Otherwise, we will use the recurrence relation and the results from previously solved subproblems to calculate `memo[subarrayCount][currIndex]`.
5. Return the value stored at `memo[0][m]`.

---

## Test Cases

**Example 1:** 
```
Input: nums = [7,2,5,10,8], m = 2
Output: 18
Explanation:
There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two subarrays is only 18.
```

**Example 2:** 
```
Input: nums = [1,2,3,4,5], m = 2
Output: 9
```

**Example 3:**
```
Input: nums = [1,4,4], m = 3
Output: 4
```