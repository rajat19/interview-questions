---
layout: post
title: Best Time to Buy and Sell Stock III
topics: [array, dynamic-programming]
langs: [java, cpp, py, c]
tc: O(n)
sc: O(1)
leetid: 123
companies: [facebook, amazon]
interviewbit: best-time-to-buy-and-sell-stocks-iii
difficulty: hard
gfg: 
hackerrank: 
leetcode: best-time-to-buy-and-sell-stock-iii
---

You are given an array prices where `prices[i]` is the price of a given stock on the i<sup>th</sup> day.

Find the maximum profit you can achieve. You may complete **at most two transactions**.

**Note:** You may not engage in multiple transactions simultaneously 
(i.e., you must sell the stock before you buy again).

---

## Test Cases

**Input:**
```
(int[]) prices = [3,3,5,0,0,3,1,4]
```

**Output:**
```
(int) 6
```

**Explanation:**
```
Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
```

---

**Input:**
```
(int[]) prices = [1,2,3,4,5]
```

**Output:**
```
(int) 4
```

**Explanation:**
```
Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Note that you cannot buy on day 1, buy on day 2 and sell them later, 
as you are engaging multiple transactions at the same time. You must sell before buying again.
```

---

**Input:**
```
(int[]) prices = [7,6,4,3,1]
```

**Output:**
```
(int) 0
```

**Explanation:**
```
In this case, no transaction is done, i.e. max profit = 0.
```