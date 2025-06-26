---
layout: post
title: Letter Combinations of a Phone Number
topics: [string]
langs: [java]
tc: O(n)
sc: O(n)
leetid: 17
gfg: iterative-letter-combinations-of-a-phone-number
companies: [adobe, amazon, apple, bloomberg, facebook, goldman, google, intuit, microsoft, oracle, twitter, uber]
difficulty: medium
hackerrank: 
interviewbit: letter-phone
leetcode: letter-combinations-of-a-phone-number
---

Given a string containing digits from `2-9` inclusive, 
return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that `1` does not map to any letters.

```
2 -> abc
3 -> def
4 -> ghi
5 -> jkl
6 -> mno
7 -> pqrs
8 -> tuv
9 -> wxyz
```

---

## Test Cases

**Example 1:** 
```
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
```

**Example 2:** 
```
Input: digits = ""
Output: []
```