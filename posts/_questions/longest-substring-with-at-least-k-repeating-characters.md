---
layout: post
title: Longest Substring with at least k repeating characters
topics: [divide-and-conquer, hash-table, sliding-window, string]
langs: [java]
tc: O(n)
sc: O(26)
leetid: 395
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: longest-substring-with-at-least-k-repeating-characters
---

Given a string `s` and an integer `k`, 
return the length of the longest substring of `s` such that the frequency of each character in this substring is greater than or equal to `k`.

---

## How to Solve

Divide and Conquer is one of the popular strategies that work in 2 phases. 
- Divide the problem into subproblems. (Divide Phase).
- Repeatedly solve each subproblem independently and combine the result to solve the original problem. (Conquer Phase).

We could apply this strategy by recursively splitting the string into substrings and 
combine the result to find the longest substring that satisfies the given condition.

---

## Test Cases

**Input:**
```
(string) s = "aaabb"
(int) k = 3
```

**Output:**
```
(int) 3
```

**Explanation:**
```
The longest substring is "aaa", as 'a' is repeated 3 times.
```

---

**Input:**
```
(string) s = "ababbc"
(int) k = 2
```

**Output:**
```
(int) 5
```

**Explanation:**
```
The longest substring is "ababb", as 'a' is repeated 2 times, b 3 times.
```