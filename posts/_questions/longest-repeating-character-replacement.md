---
layout: post
title: Longest Repeating Character Replacement
topics: [hash-table, string, sliding-window]
langs: [java, cpp]
tc: O(n)
sc: O(1)
leetid: 424
companies: 
difficulty: medium
gfg: 
hackerrank: 
interviewbit: 
leetcode: longest-repeating-character-replacement
---
You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.
Return *the length of the longest substring containing the same letter you can get after performing the above operations*.
 
---
## Test Cases
**Example 1:**
```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
```
**Example 2:**
```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.```
 
**Constraints:**
	
* `1 <= s.length <= 10<sup>5</sup>`
	
* `s` consists of only uppercase English letters.
	
* `0 <= k <= s.length`

        