---
layout: post
title: Top K Frequent Elements
topics: [array, hash-table, divide-and-conquer, sorting, heap-priority-queue, bucket-sort, counting, quickselect]
langs: [java]
tc: O(nlogn)
sc: O(n)
leetid: 347
companies: 
difficulty: medium
gfg: 
hackerrank: 
interviewbit: 
leetcode: top-k-frequent-elements
---
Given an integer array `nums` and an integer `k`, return *the* `k` *most frequent elements*. You may return the answer in **any order**.

---
## Test Cases
**Example 1:**
```
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
```

**Example 2:**
```
Input: nums = [1], k = 1
Output: [1]
```

**Constraints:**
	
* `1 <= nums.length <= 10<sup>5</sup>`
* `-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>`
* `k` is in the range `[1, the number of unique elements in the array]`.
* It is **guaranteed** that the answer is **unique**.
**Follow up:** Your algorithm's time complexity must be better than `O(n log n)`, where n is the array's size.