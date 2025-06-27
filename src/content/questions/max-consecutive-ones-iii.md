---
author: "Rajat Srivastava"
title: "Max Consecutive Ones III"
topics: "array binary-search sliding-window"
langs: "java"
tc: "O(n)"
sc: "O(1)"
leetid: 1004
difficulty: "medium"
date: 2025-06-18T01:15:27.889457
---

Given a binary array `nums` and an integer `k`, return the maximum number of consecutive `1`'s in the array if you can flip at most `k` `0`'s.

---

## Test Cases

**Example 1:** 
```
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

**Example 2:** 
```
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```