---
layout: post
title: Minimum Remove to Make Valid Parentheses
topics: [stack, string]
langs: [java, py, cpp]
tc: O(n)
sc: O(n)
leetid: 1249
difficulty: medium
companies: [facebook]
gfg: 
hackerrank: 
interviewbit: 
leetcode: minimum-remove-to-make-valid-parentheses
---

Given a string s of `'('` , `')'` and lowercase English characters.

Your task is to remove the minimum number of parentheses ( `'('` or `')'`, in any positions ) 
so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:
- It is the empty string, contains only lowercase characters, or
- It can be written as `AB` (A concatenated with B), where A and B are valid strings, or
- It can be written as `(A)`, where A is a valid string.

---

## Test Cases

**Example 1:** 
```
Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
```

**Example 2:** 
```
Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.
```