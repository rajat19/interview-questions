---
layout: post
title: Merge k Sorted Lists
difficulty: hard
topics: [linked-list, divide-and-conquer, heap-priority-queue, merge-sort]
langs: [java, cpp]
tc: O(n)
sc: O(k)
companies: [airbnb, facebook, google, uber, linkedin]
leetid: 23
leetcode: merge-k-sorted-lists
gfg: merge-k-sorted-linked-lists
interviewbit: merge-k-sorted-lists
hackerrank: merge-two-sorted-linked-lists
---
You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.
*Merge all the linked-lists into one sorted linked-list and return it.*
 
---
## Test Cases
**Example 1:**
```
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
```
**Example 2:**
```
Input: lists = []
Output: []
```
**Example 3:**
```
Input: lists = [[]]
Output: []
```
 
**Constraints:**
	
* `k == lists.length`
	
* `0 <= k <= 10<sup>4</sup>`
	
* `0 <= lists[i].length <= 500`
	
* `-10<sup>4</sup> <= lists[i][j] <= 10<sup>4</sup>`
	
* `lists[i]` is sorted in **ascending order**.
	
* The sum of `lists[i].length` will not exceed `10<sup>4</sup>`.

