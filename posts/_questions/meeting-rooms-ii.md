---
layout: post
title: Meeting Rooms II
topics: [array, greedy, sorting]
langs: [java, py, cpp, go, ts]
tc: O(n)
sc: O(n)
leetid: 253
difficulty: medium
companies: [facebook, amazon, apple, microsoft]
gfg: attend-all-meetings-ii
hackerrank: 
interviewbit: meeting-rooms
leetcode: meeting-rooms-ii
---

Given an array of meeting time intervals `intervals` where `intervals[i] = [starti, endi]`, return the minimum number of conference rooms required.
A conference room is available if it is not occupied by any meeting at the time of the new meeting.

---
## How it works
1. **Initialize a Large Array:** `delta = [0] * 1000010` creates an array (or list in Python terms) of size 1,000,010, initialized with zeros. 
This array acts as a map, where the index represents a time point and the value at each index represents the net change in the number of ongoing meetings at that time.
2. **Populate the delta Array:** For each meeting defined by its `start` and `end` times, the code increments the value at the start index by 1 and decrements the value at the end index by 1 in the delta array.
This increment and decrement operation effectively marks the beginning and end of a meeting, respectively. The positive value at the start time indicates new meetings starting, and the negative value at the end time indicates meetings ending.
3. **Accumulate Changes:** The expression accumulate(delta) computes the cumulative sum of the delta array. This step calculates the net number of meetings ongoing at each time point, based on the previously marked start and end times.
After accumulation, each value in the delta array represents the total number of meetings ongoing at the corresponding time point.
4. **Find the Maximum Value:** The maximum value in the accumulated delta array represents the peak number of simultaneous meetings. 
This peak value is the minimum number of conference rooms needed to accommodate all meetings without any overlap.

---
## Test Cases
**Example 1:** 
```
Input: intervals = [[0,30],[5,10],[15,20]]
Output: 2
Explanation:
- Room 1 is occupied from 0 to 30.
- Room 2 is occupied from 5 to 10.
- Room 2 is occupied from 15 to 20.
```

**Example 2:** 
```
Input: intervals = [[7,10],[2,4]]
Output: 1
Explanation:
- Room 1 is occupied from 2 to 4.
- Room 1 is occupied from 7 to 10.
```
