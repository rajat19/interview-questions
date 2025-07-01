---
layout: post
title: Subarray Sum Equals K
topics: [array, hash-table]
langs: [java, py]
tc: O(n)
sc: O(n)
leetid: 560
difficulty: medium
companies: [facebook]
gfg: 
hackerrank: 
interviewbit: 
leetcode: subarray-sum-equals-k
metacareers: 840934449713537
---

Given an array of integers nums and an integer `k`, return the total number of continuous subarray whose sum equals to `k`.

---
## How to Solve

The idea behind this approach is as follows: 

If the cumulative sum(represented by `sum[i]` for sum up to i<sup>th</sup> index) up to two indices is the same, 
the sum of the elements lying in between those indices is zero. 
Extending the same thought further, if the cumulative sum up to two indices, say `i` and `j` is at a difference of `k` 
i.e. `if sum[i] - sum[j] = k`, the sum of elements lying between indices `i` and `j` is `k`.

Based on these thoughts, we make use of a hashmap `map` which is used to store the cumulative sum up to all the indices possible along with the number of times the same sum occurs. 
We store the data in the form: `(sum_i, no. of occurrences of sum_i)`. 
We traverse over the array `nums` and keep on finding the cumulative sum. 
Every time we encounter a new sum, we make a new entry in the hashmap corresponding to that sum. 
If the same sum occurs again, we increment the count corresponding to that sum in the hashmap. 
Further, for every sum encountered, we also determine the number of times the sum `sum-k` has occurred already, 
since it will determine the number of times a subarray with sum `k` has occurred up to the current index. 
We increment the `count` by the same amount.

After the complete array has been traversed, the `count` gives the required result.

---
## Test Cases

**Example 1:**
```
Input: nums = [1,1,1], k = 2
Output: 2
```

**Example 2:**
```
Input: nums = [1,2,3], k = 3
Output: 2
```

**Constraints:**
* `1 <= nums.length <= 2 * 104`
* `-1000 <= nums[i] <= 1000`
* `-107 <= k <= 107`