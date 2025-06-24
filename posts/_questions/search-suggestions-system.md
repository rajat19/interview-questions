---
layout: post
title: Search Suggestions System
topics: [array, string, trie]
langs: [java]
tc: O(ns)
sc: O(1)
leetid: 1268
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: search-suggestions-system
---

You are given an array of strings `products` and a string `searchWord`.

Design a system that suggests at most three `product` names from products after each character of `searchWord` is typed. 
Suggested products should have common prefix with `searchWord`. 
If there are more than three products with a common prefix return the three **lexicographically** minimums products.

Return a list of lists of the suggested products after each character of searchWord is typed.

---

## Test Cases

**Example 1:** 
```
Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
Output: [
["mobile","moneypot","monitor"],
["mobile","moneypot","monitor"],
["mouse","mousepad"],
["mouse","mousepad"],
["mouse","mousepad"]
]
Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"]
After typing m and mo all products match and we show user ["mobile","moneypot","monitor"]
After typing mou, mous and mouse the system suggests ["mouse","mousepad"]
```

**Example 2:** 
```
Input: products = ["havana"], searchWord = "havana"
Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
```

**Example 3:**
```
Input: products = ["havana"], searchWord = "tatiana"
Output: [[],[],[],[],[],[],[]]
```

**Example 4:**
```
Input: products = ["bags","baggage","banner","box","cloths"], searchWord = "bags"
Output: [["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]]
```