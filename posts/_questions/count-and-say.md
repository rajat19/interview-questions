---
layout: post
title: Count and Say
topics: [string]
langs: [java]
tc: O(n)
sc: O(1)
leetid: 38
gfg: look-and-say-sequence
companies: [facebook]
difficulty: medium
hackerrank: 
interviewbit: count-and-say
leetcode: count-and-say
---

The **count-and-say** sequence is a sequence of digit strings defined by the recursive formula:
- `countAndSay(1) = "1"`
- `countAndSay(n)` is the way you would "say" the digit string from `countAndSay(n-1)`, which is then converted into a different digit string.

To determine how you "say" a digit string, 
split it into the minimal number of groups so that each group is a contiguous section of all the same character. 
Then for each group, say the number of characters, then say the character. 

To convert the saying into a digit string, replace the counts with a number and concatenate every saying.

For example, the saying and conversion for digit string "3322251":
<h2>
"<span style='color:red;'>33</span><span style='color:blue;'>222</span><span style='color:pink;'>5</span><span style='color:green;'>1</span>"
</h2>
<h2>
<span style='color:red;'>two 3's, </span><span style='color:blue;'>three 2's, </span><span style='color:pink;'>one 5, </span><span style='color:green;'>one 1</span>
</h2>
<h2>
<span style='color:red;'>2 3</span>+<span style='color:blue;'>3 2</span>+<span style='color:pink;'>1 5</span>+<span style='color:green;'>1 1</span>
</h2>
<h2>
"<span style='color:red;'>23</span><span style='color:blue;'>32</span><span style='color:pink;'>15</span><span style='color:green;'>11</span>"
</h2>


Given a positive integer `n`, return the nth term of the count-and-say sequence.

---

## Test Cases

**Example 1:** 
```
Input: n = 1
Output: "1"
Explanation: This is the base case.
```

**Example 2:** 
```
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
```