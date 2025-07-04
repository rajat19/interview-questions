---
layout: post
title: Course Schedule III
topics: [array, greedy, heap]
langs: [java]
tc: O(nlogn)
sc: O(n)
leetid: 630
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: course-schedule-iii
---

There are `n` different online courses numbered from `1` to `n`. 
You are given an array courses where `courses[i] = [duration, lastDay]` 
indicate that the ith course should be taken continuously for duration<sub>i</sub> days 
and must be finished before or on lastDay<sub>i</sub>.

You will start on the 1<sup>st</sup> day and you cannot take two or more courses simultaneously.

Return the maximum number of courses that you can take.

---

## Test Cases

**Example 1:**
```
Input: courses = [[100,200],[200,1300],[1000,1250],[2000,3200]]
Output: 3
Explanation: 
There are totally 4 courses, but you can take 3 courses at most:
First, take the 1st course, it costs 100 days so you will finish it on the 100th day, and ready to take the next course on the 101st day.
Second, take the 3rd course, it costs 1000 days so you will finish it on the 1100th day, and ready to take the next course on the 1101st day. 
Third, take the 2nd course, it costs 200 days so you will finish it on the 1300th day. 
The 4th course cannot be taken now, since you will finish it on the 3300th day, which exceeds the closed date.
```

**Example 2:**
```
Input: courses = [[1,2]]
Output: 1
```

**Example 3:**
```
Input: courses = [[3,2],[4,3]]
Output: 0
```