---
layout: post
title: Generate Parentheses
topics: [backtracking, dynamic-programming, string]
langs: [java]
tc: O(4<sup>n</sup>/n&#8730;n)
sc: O(4<sup>n</sup>/n&#8730;n)
leetid: 22
companies: [adobe, amazon, apple, bloomberg, facebook, goldman, google, microsoft, uber]
gfg: print-all-combinations-of-balanced-parentheses
difficulty: medium
hackerrank: 
interviewbit: 
leetcode: generate-parentheses
---

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

---
## How to Solve

### Approach 1
To generate all sequences, we use a recursion. 
All sequences of length n is just `(` plus all sequences of length n-1, and then `)` plus all sequences of length n-1.

To check whether a sequence is valid, we keep track of balance, 
the net number of opening brackets minus closing brackets. 
If it falls below zero at any time, or doesn't end in zero, the sequence is invalid - otherwise it is valid.

### Approach 2
Instead of adding '(' or ')' every time as in Approach 1, 
let's only add them when we know it will remain a valid sequence.
We can do this by keeping track of the number of opening and closing brackets we have placed so far.

We can start an opening bracket if we still have one (of `n`) left to place. 
And we can start a closing bracket if it would not exceed the number of opening brackets.

---
## Test Cases

**Input:**

    (int) n = 3

**Output:**

    (String[]) ["((()))","(()())","(())()","()(())","()()()"] 
