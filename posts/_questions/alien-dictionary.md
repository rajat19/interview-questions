---
layout: post
title: Alien Dictionary
topics: [string, topological-sort, graph]
langs: [java, cpp, py]
tc: O(n)
sc: O(1)
leetid: 269
companies: [airbnb, amazon, apple, bloomberg, facebook, google, microsoft, oracle, pinterest, snapchat, twitter, uber, vmware]
interviewbit:
difficulty: hard
gfg: given-sorted-dictionary-find-precedence-characters
hackerrank: 
leetcode: alien-dictionary
---

There is a new alien language which uses the latin alphabet. 
However, the order among letters are unknown to you. 
You receive a list of non-empty words from the dictionary, where words are sorted lexicographically by the rules of this new language. 
Derive the order of letters in this language.

Note:
1. You may assume all letters are in lowercase.
2. You may assume that if a is a prefix of b, then a must appear before b in the given dictionary.
3. If the order is invalid, return an empty string.
4. There may be multiple valid order of letters, return any one of them is fine.

---
## Test Cases
**Examples 1:**
```
Input:
[
  "wrt",
  "wrf",
  "er",
  "ett",
  "rftt"
]

Output: "wertf"
```

**Examples 2:**
```
Input:
[
  "z",
  "x"
]
Output: "zx"
```

**Examples 3:**
```
Input:
[
  "z",
  "x",
  "z"
]
Output: ""
Explanation: The order is invalid, so return "".
```

**Constraints:**
* `1 <= words.length <= 100`
* `1 <= words[i].length <= 100`
* `words[i] consists of only lowercase English letters.`