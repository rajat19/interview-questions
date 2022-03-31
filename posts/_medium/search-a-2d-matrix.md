---
layout: post
author: Rajat Srivastava
title: Search a 2D Matrix
topics: string
langs: java cpp c py go
tc: O(mn)
sc: O(1)
leetid: 74
---

Write an efficient algorithm that searches for a value target in an `m` x `n` integer `matrix`. This matrix has the following properties:
- Integers in each row are sorted from left to right.
- The first integer of each row is greater than the last integer of the previous row.

---

## Test Cases

**Example 1:** 

<table class="post-example-table">
    <tr>
        <td>1</td>
        <td class="blue">3</td>
        <td>5</td>
        <td>7</td>
    </tr>
    <tr>
        <td>10</td>
        <td>11</td>
        <td>16</td>
        <td>20</td>
    </tr>
    <tr>
        <td>23</td>
        <td>30</td>
        <td>34</td>
        <td>60</td>
    </tr>
</table>

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
```

**Example 2:** 
```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
```