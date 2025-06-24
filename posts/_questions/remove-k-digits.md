---
layout: post
title: Remove K Digits
topics: [greedy, string, stack]
langs: [java, py]
tc: O(n+k)
sc: O(n)
leetid: 402
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: remove-k-digits
---

Given string `num` representing a non-negative integer `num`, and an integer `k`, 
return the smallest possible integer after removing `k` digits from `num`.

---

## Test Cases

**Input:**
```
(string) num = "1432219"
(int) k = 3
```

**Output:**
```
(string) "1219"
```

**Explanation:**
```
Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
```

---

**Input:**
```
(string) num = "10200"
(int) k = 1
```

**Output:**
```
(string) "200"
```

**Explanation:**
```
Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
```
