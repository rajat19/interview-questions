---
author: "Rajat Srivastava"
title: "Search a 2D Matrix"
topics: "array binary-search matrix"
langs: "java cpp c py go"
tc: "O(mn)"
sc: "O(1)"
leetid: 74
difficulty: "medium"
date: 2025-06-18T01:15:27.922128
---

Write an efficient algorithm that searches for a value target in an `m` x `n` integer `matrix`. This matrix has the following properties:
- Integers in each row are sorted from left to right.
- The first integer of each row is greater than the last integer of the previous row.

---

## Test Cases

**Example 1:** 

{% include matrix.html rows=3 cols=4 matrix='1,3:$blue,5,7,10,11,16,20,23,30,34,60' %}
```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
```

**Example 2:** 

{% include matrix.html rows=3 cols=4 matrix='1,3,5,7,10,11,16,20,23,30,34,60' %}
```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
```