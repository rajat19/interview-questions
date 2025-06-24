---
layout: post
title: Score of Parentheses
topics: [stack, string]
langs: [java, py]
tc: O(n)
sc: O(n)
leetid: 856
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: score-of-parentheses
---

Given a balanced parentheses string `s`, return the score of the string.

The score of a balanced parentheses string is based on the following rule:
- `"()"` has score `1`.
- `AB` has score `A + B`, where `A` and `B` are balanced parentheses strings.
- `(A)` has score `2 * A`, where `A` is a balanced parentheses string.

---

## Test Cases

**Example 1:** 
```
Input: s = "()"
Output: 1
```

**Example 2:** 
```
Input: s = "(())"
Output: 2
```

**Example 3:**
```
Input: s = "()()"
Output: 2
```