---
layout: post
title: Word Search II
topics: [array, backtracking, string, trie]
langs: [java]
tc: O(nm)
sc: O(w)
leetid: 212
gfg: boggle-using-trie
difficulty: hard
companies: 
hackerrank: 
interviewbit: 
leetcode: word-search-ii
---

Given an `m x n` board of characters and a list of strings words, return all words on the board.

Each word must be constructed from letters of sequentially **adjacent cells**, 
where adjacent cells are horizontally or vertically neighboring. 
The same letter cell may not be used more than once in a word.

---

## Test Cases

**Example 1:**

<table class="post-example-table">
    <tr>
        <td class="green">o</td>
        <td class="green">a</td>
        <td>a</td>
        <td>n</td>
    </tr>
    <tr>
        <td>e</td>
        <td class="red">t</td>
        <td class="red">a</td>
        <td class="red">e</td>
    </tr>
    <tr>
        <td>i</td>
        <td class="green">h</td>
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

<table class="post-example-table">
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