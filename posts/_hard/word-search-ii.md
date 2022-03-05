---
layout: post
author: Rajat Srivastava
title: Word Search II
tags: array backtracking string trie
langs: java
tc: O(nm)
sc: O(w)
leetid: 0
---

Given an `m x n` board of characters and a list of strings words, return all words on the board.

Each word must be constructed from letters of sequentially **adjacent cells**, 
where adjacent cells are horizontally or vertically neighboring. 
The same letter cell may not be used more than once in a word.

---

## Test Cases

**Example 1:**

<table>
    <tr>
        <td style="background-color: green">o</td>
        <td style="background-color: green">a</td>
        <td>a</td>
        <td>n</td>
    </tr>
    <tr>
        <td>e</td>
        <td style="background-color: red">t</td>
        <td style="background-color: red">a</td>
        <td style="background-color: red">e</td>
    </tr>
    <tr>
        <td>i</td>
        <td style="background-color: green">h</td>
        <td>k</td>
        <td>r</td>
    </tr>
    <tr>
        <td>i</td>
        <td>f</td>
        <td>l</td>
        <td>v</td>
    </tr>
</table>


```
Input: board = [
    ["o","a","a","n"],
    ["e","t","a","e"],
    ["i","h","k","r"],
    ["i","f","l","v"]
], words = ["oath","pea","eat","rain"]
Output: ["eat","oath"]
```

**Example 2:** 

<table>
    <tr>
        <td>a</td>
        <td>b</td>
    </tr>
    <tr>
        <td>c</td>
        <td>d</td>
    </tr>
</table>

```
Input: board = [["a","b"],["c","d"]], words = ["abcb"]
Output: []
```