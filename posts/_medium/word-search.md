---
layout: post
author: Rajat Srivastava
title: Word Search
topics: array backtracking string
langs: java
tc: O(nmw)
sc: O(1)
leetid: 79
---

Given an `m x n` grid of characters `board` and a string `word`, 
return `true` if `word` exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, 
where adjacent cells are horizontally or vertically neighboring. 
The same letter cell may not be used more than once.

---

## Test Cases

![Word Search]({{ site.github.url }}/assets/img/code/word2.jpeg)

**Input:**
```
(char[]) board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
(string) word = "ABCCED"
```

**Output:**
```
(boolean) true
```

---

**Input:**
```
(char[]) board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
(string) word = "See"
```

**Output:**
```
(boolean) true
```

---

**Input:**
```
(char[]) board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
(string) word = "ABCB"
```

**Output:**
```
(boolean) false
```