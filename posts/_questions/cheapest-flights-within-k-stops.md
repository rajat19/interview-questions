---
layout: post
title: Cheapest Flights Within K Stops
topics: [breadth-first-search, depth-first-search, dynamic-programming, graph]
langs: [java, cpp]
tc: O(n<sup>k</sup>)
sc: O(n<sup>2</sup>k)
leetid: 787
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: cheapest-flights-within-k-stops
---

There are `n` cities connected by some number of flights. 
You are given an array flights where `flights[i] = [from, to, price]` 
indicates that there is a flight from city from<sub>i</sub> to city to<sub>i</sub> with cost price<sub>i</sub>.

You are also given three integers `src`, `dst`, and `k`, 
return the cheapest price from `src` to `dst` with at most `k` stops. If there is no such route, return `-1`.

---

## Test Cases

**Example 1:**

![Cheapest flight]({{site.github.url}}/assets/img/code/995.png)
```
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
Output: 200
Explanation: The graph is shown.
The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.
```

**Example 2:**

![Cheapest flight]({{site.github.url}}/assets/img/code/995.png)
```
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
Output: 500
Explanation: The graph is shown.
The cheapest price from city 0 to city 2 with at most 0 stop costs 500, as marked blue in the picture.
```