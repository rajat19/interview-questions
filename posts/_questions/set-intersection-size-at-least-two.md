---
layout: post
title: Set Intersection Size At Least Two
topics: [array, greedy, sorting]
langs: [java]
tc: O(nlogn)
sc: O(1)
leetid: 757
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: set-intersection-size-at-least-two
---

An integer interval `[a, b]` (for integers `a < b`) is a set of all consecutive integers from `a` to `b`, including `a` and `b`.

Find the minimum size of a set S such that for every integer interval A in `intervals`, 
the intersection of S with A has a size of at least two.

---
## How to Solve

First sort the intervals, with their ending points from low to high

We deal with the sorted intervals one by one.
1. If there is no number in this interval being chosen before, we pick up 2 biggest number in this interval. 
(the biggest number have the most possibility to be used by next interval)
2. If there is one number in this interval being chosen before, we pick up the biggest number in this interval.
3. If there are already two numbers in this interval being chosen before, we can skip this interval since the requirement has been fulfilled.

---

## Test Cases

**Input:**
```
(int[]) intervals = [[1,3],[1,4],[2,5],[3,5]]
```

**Output:**
```
(int) 3
```

**Explanation:**
```
Consider the set S = {2, 3, 4}.  For each interval, there are at least 2 elements from S in the interval.
Also, there isn't a smaller size set that fulfills the above condition.
Thus, we output the size of this set, which is 3.
```

---

**Input:**
```
(int[]) intervals = [[1,2],[2,3],[2,4],[4,5]]
```

**Output:**
```
(int) 5
```

**Explanation:**
```
An example of a minimum sized set is {1, 2, 3, 4, 5}.
```