---
layout: post
author: Rajat Srivastava
title: Set Matrix Zeroes
topics: array hash-table matrix
langs: java
tc: O(n<sup>2</sup>)
sc: O(1)
leetid: 73
---

Given an `m x n` integer `matrix`, if an element is `0`, set its entire row and column to `0`'s.

You must do it in place.

---

## Test Cases

**Example 1:** 

<div style="display: flex">
<table class="post-example-table">
    <tr>
        <td>1</td>
        <td>1</td>
        <td>1</td>
    </tr>
    <tr>
        <td>1</td>
        <td class="blue">0</td>
        <td>1</td>
    </tr>
    <tr>
        <td>1</td>
        <td>1</td>
        <td>1</td>
    </tr>
</table>
<div style="margin: 10px; align-items: center; display: flex">---></div>
<table class="post-example-table">
    <tr>
        <td>1</td>
        <td class="green">0</td>
        <td>1</td>
    </tr>
    <tr>
        <td class="green">0</td>
        <td class="blue">0</td>
        <td class="green">0</td>
    </tr>
    <tr>
        <td>1</td>
        <td class="green">0</td>
        <td>1</td>
    </tr>
</table>
</div>

```
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
```

**Example 2:** 
```
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
```