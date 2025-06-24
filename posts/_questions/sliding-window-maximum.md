---
layout: post
title: Sliding Window Maximum
topics: [array, heap, queue, sliding-window]
langs: [java, py]
tc: O(n)
sc: O(k)
leetid: 239
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: sliding-window-maximum
---

You are given an array of integers nums, 
there is a sliding window of size `k` which is moving from the very left of the array to the very right. 
You can only see the `k` numbers in the window. 
Each time the sliding window moves right by one position.

Return the _max sliding window_.

---

## Test Cases

**Input:** 
```
(int[]) nums = [1,3,-1,-3,5,3,6,7]
(int) k = 3
```

**Output:** 
```
(int[]) [3,3,5,5,6,7]
```

**Explanation:**
```
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
```

---

**Input:**
```
(int[]) nums = [1]
(int) k = 1
```

**Output:**
```
(int[]) [1]
```