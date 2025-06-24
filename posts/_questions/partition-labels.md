---
layout: post
title: Partition Labels
topics: [hash-table, greedy, string]
langs: [java, py]
tc: O(n)
sc: O(1)
leetid: 763
difficulty: medium
companies: 
gfg: 
hackerrank: 
interviewbit: 
leetcode: partition-labels
---

You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be `s`.

Return a list of integers representing the size of these parts.

---

## How to Solve

### Intuition

Let's try to repeatedly choose the smallest left-justified partition. 
Consider the first label, say it's 'a'. 
The first partition must include it, and also the last occurrence of 'a'. 
However, between those two occurrences of 'a', 
there could be other labels that make the minimum size of this partition bigger. 
For example, in `"abccaddbeffe"`, the minimum first partition is `"abccaddb"`. 
This gives us the idea for the algorithm: For each letter encountered, 
process the last occurrence of that letter, extending the current partition `[start, end]` appropriately.

### Algorithm

We need an array `last[char] -> index of S where char occurs last`. 
Then, let `start` and `end` be the start and end of the current partition. 
If we are at a label that occurs last at some index after `end`, 
we'll extend the partition `end = last[c]`. 
If we are at the end of the partition `(i == end)` then we'll append a partition size to our answer, 
and set the start of our new partition to `i+1`.

---

## Test Cases

**Input:** 
```
(string) s = "ababcbacadefegdehijhklij"
```

**Output:** 
```
(int[]) [9,7,8]
```

**Explanation:**
```
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
```

---

**Input:**
```
(string) s = "eccbbbbdec"
```

**Output:**
```
(int[]) [10]
```
