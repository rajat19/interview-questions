---
layout: post
title: Partition Equal Subset Sum
topics: [array, dynamic-programming]
langs: [java, py]
tc: O(n*sum)
sc: O(sum)
leetid: 416
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: partition-equal-subset-sum
---

Given a non-empty array nums containing only positive integers, 
find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

---

## Test Cases

**Example 1:** 
```
Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
```

**Example 2:** 
```
Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.
```