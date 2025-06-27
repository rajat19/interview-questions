---
author: "Rajat Srivastava"
title: "Basic Calculator II"
topics: "math string stack"
langs: "java"
tc: "O(n)"
sc: "O(n)"
leetid: 227
companies: None
difficulty: "medium"
date: 2025-06-18T01:15:27.923793
---
Given a string `s` which represents an expression, *evaluate this expression and return its value*. 
The integer division should truncate toward zero.
You may assume that the given expression is always valid. All intermediate results will be in the range of `[-2<sup>31</sup>, 2<sup>31</sup> - 1]`.
**Note:** You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as `eval()`.
 
---
## Test Cases
**Example 1:**
```
Input: s = "3+2*2"
Output: 7
```
**Example 2:**
```
Input: s = " 3/2 "
Output: 1
```

**Example 3:**
```
Input: s = " 3+5 / 2 "
Output: 5
```
 
**Constraints:**
	
* `1 <= s.length <= 3 * 10<sup>5</sup>`
* `s` consists of integers and operators `('+', '-', '*', '/')` separated by some number of spaces.
* `s` represents **a valid expression**.
* All the integers in the expression are non-negative integers in the range `[0, 2<sup>31</sup> - 1]`.
* The answer is **guaranteed** to fit in a **32-bit integer**.

        