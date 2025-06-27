---
layout: post
title: Remove Invalid Parentheses
difficulty: hard
topics: [string, backtracking, breadth-first-search]
langs: [java]
tc: O(2<sup>n</sup>)
sc: O(n2<sup>n</sup>)
companies: [facebook, google]
leetid: 301
leetcode: remove-invalid-parentheses
gfg: remove-invalid-parentheses
interviewbit: 
hackerrank: 
---
Given a string `s` that contains parentheses and letters, remove the minimum number of invalid parentheses to make the input string valid.
Return *a list of **unique strings** that are valid with the minimum number of removals*. You may return the answer in **any order**.

---
## Test Cases
**Example 1:**
```
Input: s = "()())()"
Output: ["(())()","()()()"]
```

**Example 2:**
```
Input: s = "(a)())()"
Output: ["(a())()","(a)()()"]
```

**Example 3:**
```
Input: s = ")("
Output: [""]
```
 
**Constraints:**
	
* `1 <= s.length <= 25`
* `s` consists of lowercase English letters and parentheses `'('` and `')'`.
* There will be at most `20` parentheses in `s`.

