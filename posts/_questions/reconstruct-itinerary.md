---
layout: post
title: Reconstruct Itinerary
topics: [string]
langs: [java]
tc: O(1)
sc: O(V<sup>2</sup>)
leetid: 332
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: reconstruct-itinerary
---

You are given a list of airline tickets where `tickets[i] = [from[i], to[i]]` represent the departure and the arrival airports of one flight. 
Reconstruct the itinerary in order and return it.

All the tickets belong to a man who departs from `"JFK"`, thus, the itinerary must begin with "JFK". 
If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string.

For example, the itinerary `["JFK", "LGA"]` has a smaller lexical order than `["JFK", "LGB"]`.
You may assume all tickets form at least one valid itinerary. You must use all the tickets once and only once.

---

## Test Cases

**Example 1:** 
```
Input: tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
Output: ["JFK","MUC","LHR","SFO","SJC"]
JFK -> MUC -> LHR -> SFO -> SJC
```

**Example 2:** 
```
Input: tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"] but it is larger in lexical order.
```