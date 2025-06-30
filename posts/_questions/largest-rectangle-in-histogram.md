---
layout: post
title: Largest Rectangle in Histogram
topics: [array, stack]
langs: [java, py, go, cpp]
tc: O(n)
sc: O(n)
leetid: 84
companies: [facebook, google, amazon]
gfg: largest-rectangular-area-in-a-histogram-using-segment-tree
difficulty: hard
hackerrank: 
interviewbit: largest-rectangle-in-histogram
leetcode: largest-rectangle-in-histogram
---

Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
return the area of the largest rectangle in the `histogram`.

---

## Test Cases

**Input:**

<div class="post-example-bar">
    <div class="bar" style="height: 20%;">2</div>  
    <div class="bar" style="height: 10%;">1</div>
    <div class="bar selected" style="height: 50%;">5</div>
    <div style="height: 60%">
        <div class="bar" style="height: 16.67%;">1</div>
        <div class="bar selected" style="height: 83.33%;">5</div>
    </div>
    <div class="bar" style="height: 20%;">2</div>
    <div class="bar" style="height: 30%;">3</div>
</div>


```
(int[]) heights = [2,1,5,6,2,3]
```

**Output:**
```
(int) 10
```