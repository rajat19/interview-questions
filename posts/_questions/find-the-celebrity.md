---
layout: post
title: Find the Celebrity
topics: [two-pointers]
langs: [java, py, cpp, go]
tc: O(n)
sc: O(1)
leetid: 277
companies: [facebook, linkedin, amazon, apple, google, microsoft, pinterest, uber]
difficulty: medium
gfg: the-celebrity-problem
hackerrank: 
interviewbit: 
leetcode: find-the-celebrity
---

Suppose you are at a party with `n` people (labeled from `0` to `n - 1`) and among them, there may exist one celebrity. 
The definition of a celebrity is that all the other `n - 1` people know him/her but he/she does not know any of them.

Now you want to find out who the celebrity is or verify that there is not one. 
The only thing you are allowed to do is to ask questions like: 
"Hi, A. Do you know B?" to get information of whether A knows B. 
You need to find out the celebrity (or verify there is not one) by asking as few questions as possible (in the asymptotic sense).

You are given a helper function `bool knows(a, b)` which tells you whether `a` knows `b`. 
Implement a function `int findCelebrity(n)`. There will be exactly one celebrity if he/she is in the party. 

Return the celebrity's label if there is a celebrity in the party. If there is no celebrity, return `-1`.

---
## Test Cases

**Example 1:**
```
Input: graph = [[1,1,0],[0,1,0],[1,1,1]]
Output: 1
Explanation: There are three persons labeled with 0, 1 and 2. 
graph[i][j] = 1 means person i knows person j, otherwise graph[i][j] = 0 means person i does not know person j. 
The celebrity is the person labeled as 1 because both 0 and 2 know him but 1 does not know anybody.
```

**Example 2:**
```
Input: graph = [[1,0,1],[1,1,0],[0,1,1]]
Output: -1
Explanation: There is no celebrity.
```