---
layout: post
author: Rajat Srivastava
title: Maximal Rectangle
topics: array dynamic-programming matrix stack
langs: java
tc: O(nm)
sc: O(m)
leetid: 85
---

Given a `rows x cols` binary matrix filled with `0`'s and `1`'s, find the largest rectangle containing only `1`'s and return its area.

---

## Test Cases

**Input:**
<table class="post-example-table">
    <tr>
        <td>1</td>
        <td>0</td>
        <td>1</td>
        <td>0</td>
        <td>0</td>
    </tr>
    <tr>
        <td>1</td>
        <td>0</td>
        <td class="blue">1</td>
        <td class="blue">1</td>
        <td class="blue">1</td>
    </tr>
    <tr>
        <td>1</td>
        <td>1</td>
        <td class="blue">1</td>
        <td class="blue">1</td>
        <td class="blue">1</td>
    </tr>
    <tr>
        <td>1</td>
        <td>0</td>
        <td>0</td>
        <td>1</td>
        <td>0</td>
    </tr>
</table>
```
(int[]) matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
```

**Output:**
```
(int) 6
```