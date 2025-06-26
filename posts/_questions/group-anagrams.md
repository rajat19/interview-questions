---
layout: post
title: Group Anagrams
topics: [array, hash-table, string, sorting]
langs: [java, py]
tc: O(nm)
sc: O(nm)
leetid: 49
companies: [facebook, uber]
gfg: given-a-sequence-of-words-print-all-anagrams-together
difficulty: medium
hackerrank: 
interviewbit: 
leetcode: group-anagrams
---
Given an array of strings `strs`, group the `anagrams` together. You can return the answer in **any order**.
 
---
## Test Cases
**Example 1:**
```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:
* There is no string in strs that can be rearranged to form `"bat"`.
* The strings `"nat"` and `"tan"` are anagrams as they can be rearranged to form each other.
* The strings `"ate"`, `"eat"`, and `"tea"` are anagrams as they can be rearranged to form each other.
```

**Example 2:**
```
Input: strs = [""]
Output: [[""]]
```

**Example 3:**
```
Input: strs = ["a"]
Output: [["a"]]
```
 
**Constraints:**
* `1 <= strs.length <= 10<sup>4</sup>`
* `0 <= strs[i].length <= 100`
* `strs[i]` consists of lowercase English letters.

        