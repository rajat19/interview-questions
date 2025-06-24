---
layout: post
title: Find K Closest Elements
topics: [array, two-pointers, binary-search, sliding-window, sorting, heap-priority-queue]
langs: [java, py]
tc: O(n)
sc: O(1)
leetid: 658
companies: 
difficulty: medium
gfg: 
hackerrank: 
interviewbit: 
leetcode: find-k-closest-elements
---
Given a **sorted** integer array `arr`, two integers `k` and `x`, return the `k` closest integers to `x` in the array. The result should also be sorted in ascending order.
An integer `a` is closer to `x` than an integer `b` if:
	
* `|a - x| < |b - x|`, or
	
* `|a - x| == |b - x|` and `a < b`
 
---
## Test Cases
**Example 1:**
<div class="example-block">
Input: <span class="example-io">arr = [1,2,3,4,5], k = 4, x = 3</span>
Output: <span class="example-io">[1,2,3,4]</span>
</div>
**Example 2:**
<div class="example-block">
Input: <span class="example-io">arr = [1,1,2,3,4,5], k = 4, x = -1</span>
Output: <span class="example-io">[1,1,2,3]</span>
</div>
 
**Constraints:**
	
* `1 <= k <= arr.length`
	
* `1 <= arr.length <= 10<sup>4</sup>`
	
* `arr` is sorted in **ascending** order.
	
* `-10<sup>4</sup> <= arr[i], x <= 10<sup>4</sup>`

        