---
layout: post
author: Rajat Srivastava
title: Hello World
tags: sliding-window string
langs: java
tc: O(n)
sc: O(26)
leetid: 395
---

Given a string `s` and an integer `k`, 
return the length of the longest substring of `s` such that the frequency of each character in this substring is greater than or equal to `k`.

---

## Test Cases

**Input:**
```
(string) s = "aaabb"
(int) k = 3
```

**Output:**
```
(int) 3
```

**Explanation:**
```
The longest substring is "aaa", as 'a' is repeated 3 times.
```

---

**Input:**
```
(string) s = "ababbc"
(int) k = 2
```

**Output:**
```
(int) 5
```

**Explanation:**
```
The longest substring is "ababb", as 'a' is repeated 2 times, b 3 times.
```