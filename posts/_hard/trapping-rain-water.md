---
layout: post
author: Rajat Srivastava
title: Trapping Rain Water
tags: arrays
langs: java go
tc: O(n)
sc: O(1)
leetid: 42

---

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

---
## Test Cases

**Input:**

    (int[]) nums = [0,1,0,2,1,0,1,3,2,1,2,1]

**Output:**

    (int) 6

**Explanation:**

![Rain Water]({{ site.github.url }}/assets/img/code/rainwatertrap.png)

    The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

---

**Input:**

    (int[]) nums = [4,2,0,3,2,5]

**Output:**

    (int) 9