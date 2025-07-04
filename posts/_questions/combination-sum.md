---
layout: post
title: Combination Sum
topics: [array, backtracking]
langs: [java, cpp, py]
tc: O(2<sup>n</sup>)
sc: O(n)
leetid: 32
companies: [adobe, airbnb, amazon, apple, facebook, goldman, linkedin, microsoft, salesforce]
difficulty: medium
gfg: 
hackerrank: 
interviewbit: combination-sum
leetcode: combination-sum
---

Given an array of distinct integers `candidates` and a target integer `target`, 
return a list of all unique combinations of `candidates` where the chosen numbers sum to `target`. 
You may return the combinations in any order.

The same number may be chosen from `candidates` an unlimited number of times. 
Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to `target` is less than `150` combinations for the given input.

---

## Test Cases

**Example 1:** 
```
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
```

**Example 2:** 
```
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
```