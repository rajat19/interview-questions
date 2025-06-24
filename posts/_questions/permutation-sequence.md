---
layout: post
title: Permutation Sequence
topics: [recursion]
langs: [java]
tc: O(n)
sc: O(n)
leetid: 60
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: permutation-sequence
---

The set `[1, 2, 3, ..., n]` contains a total of `n!` unique permutations.

By listing and labeling all the permutations in order, we get the following sequence for `n = 3`:

1. "123"
2. "132"
3. "213"
4. "231"
5. "312"
6. "321"

Given `n` and `k`, return the `kth` permutation sequence.

---

## Test Cases

**Example 1:** 
```
Input: n = 3, k = 3
Output: "213"
```

**Example 2:** 
```
Input: n = 4, k = 9
Output: "2314"
```