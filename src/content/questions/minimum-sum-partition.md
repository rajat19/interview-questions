---
author: "Rajat Srivastava"
title: "Minimum sum partition"
topics: "array dynamic-programming"
langs: "java"
tc: "O(n)"
sc: "O(n)"
difficulty: "hard"
date: 2025-06-18T01:15:27.869249
---

Given an integer array arr of size N, 
the task is to divide it into two sets `S1` and `S2` such that the absolute difference between their sums is minimum and find the minimum difference

---

## Test Cases

**Example 1:** 
```
Input: N = 4, arr[] = {1, 6, 11, 5} 
Output: 1
Explanation: 
Subset1 = {1, 5, 6}, sum of Subset1 = 12 
Subset2 = {11}, sum of Subset2 = 11   
```

**Example 2:** 
```
Input: N = 2, arr[] = {1, 4}
Output: 3
Explanation: 
Subset1 = {1}, sum of Subset1 = 1
Subset2 = {4}, sum of Subset2 = 4
```