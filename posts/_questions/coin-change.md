---
layout: post
title: Coin Change
topics: [array, dynamic-programming]
langs: [java, py, cpp, c]
tc: O(n*amount)
sc: O(amount)
leetid: 322
companies: [amazon, apple, google, microsoft, adobe]
difficulty: medium
gfg: 
hackerrank: 
interviewbit: 
leetcode: coin-change
---

You are given an integer array coins representing coins of different denominations and 
an integer `amount` representing a total amount of money.

Return the _fewest number of coins that you need to make up that amount_. 
If that amount of money cannot be made up by any combination of the coins, return `-1`.

You may assume that you have an infinite number of each kind of coin.

---

## Test Cases

**Input:**
```
(int[]) coins = [1,2,5]
(int) amount = 11
```

**Output:**
```
(int) 3
```

**Explanation:**
```
11 = 5 + 5 + 1
```

---

**Input:**
```
(int[]) coins = [2]
(int) amount = 3
```

**Output:**
```
(int) -1
```

---

**Input:**
```
(int[]) coins = [1]
(int) amount = 0
```

**Output:**
```
(int) 0
```