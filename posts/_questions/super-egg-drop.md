---
layout: post
title: Super Egg Drop
topics: [binary-search, dynamic-programming]
langs: [java, py, cpp]
tc: O(KlogN)
sc: O(NK)
leetid: 887
difficulty: hard
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: super-egg-drop
---

You are given `K` identical eggs and you have access to a building with `N` floors labeled from `1` to `N`.

You know that there exists a floor `F` where `0 <= F <= N` such that any egg dropped at a floor higher than `F` will break, 
and any egg dropped at or below floor `F` will not break.

Each move, 
you may take an unbroken egg and drop it from any floor `X` (where `1 <= X <= N`). 
If the egg breaks, you can no longer use it. 
However, if the egg does not break, you may **reuse** it in future moves.

Return the **_minimum number of moves_** that you need to determine with certainty what the value of `F` is.

---

## How to Solve

Consider this problem in a different way:
`dp[M][K]` means that, given `K` eggs and `M` moves,
what is the maximum number of floor that we can check.

The dp equation is:
```
dp[m][k] = dp[m - 1][k - 1] + dp[m - 1][k] + 1,
```

which means we take `1` move to a floor,
if egg breaks, then we can check `dp[m - 1][k - 1]` floors.
if egg doesn't breaks, then we can check `dp[m - 1][k]` floors.

`dp[m][k]` is the number of combinations, and it increases exponentially to `N`

---

## Test Cases

**Input:** 
```
(int) k = 1
(int) n = 2
```

**Output:** 
```
(int) 2
```

**Explanation:**
```
Drop the egg from floor 1. If it breaks, we know that f = 0.
Otherwise, drop the egg from floor 2. If it breaks, we know that f = 1.
If it does not break, then we know f = 2.
Hence, we need at minimum 2 moves to determine with certainty what the value of f is.
```

---

**Input:** 
```
(int) k = 2
(int) n = 6
```

**Output:** 
```
(int) 3
```

---

**Input:**
```
(int) k = 3
(int) n = 14
```

**Output:**
```
(int) 4
```
