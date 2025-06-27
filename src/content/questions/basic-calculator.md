---
author: "Rajat Srivastava"
title: "Basic Calculator"
topics: "math string stack recursion"
langs: "java cpp py"
tc: "O(n)"
sc: "O(n)"
leetid: 224
companies: None
difficulty: "hard"
date: 2025-06-18T01:15:27.875141
---
Given a string `s` representing a valid expression, implement a basic calculator to evaluate it, and return *the result of the evaluation*.
**Note:** You are **not** allowed to use any built-in function which evaluates strings as mathematical expressions, such as `eval()`.
 
---
## Test Cases
**Example 1:**
```
Input: s = "1 + 1"
Output: 2
```
**Example 2:**
```
Input: s = " 2-1 + 2 "
Output: 3
```
**Example 3:**
```
Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23
```
 
**Constraints:**
	
* `1 <= s.length <= 3 * 10<sup>5</sup>`
	
* `s` consists of digits, `'+'`, `'-'`, `'('`, `')'`, and `' '`.
	
* `s` represents a valid expression.
	
* `'+'` is **not** used as a unary operation (i.e., `"+1"` and `"+(2 + 3)"` is invalid).
	
* `'-'` could be used as a unary operation (i.e., `"-1"` and `"-(2 + 3)"` is valid).
	
* There will be no two consecutive operators in the input.
	
* Every number and running calculation will fit in a signed 32-bit integer.

        