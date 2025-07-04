---
layout: post
title: Wildcard Matching
topics: [dynamic-programming, greedy, string]
langs: [java, cpp]
tc: O(n+m)
sc: O(m)
leetid: 44
difficulty: hard
companies: [facebook]
gfg: 
hackerrank: 
interviewbit: 
leetcode: wildcard-matching
---

Given an input string `(s)` and a pattern `(p)`, implement wildcard pattern matching with support for `'?'` and `'*'` where:

- `'?'` Matches any single character.
- `'*'` Matches any sequence of characters (including the empty sequence).

The matching should cover the entire input string (not partial).

---

## Test Cases

**Example 1:** 
```
Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
```

**Example 2:** 
```
Input: s = "aa", p = "*"
Output: true
Explanation: '*' matches any sequence.
```

**Example 3:**
```
Input: s = "cb", p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
```