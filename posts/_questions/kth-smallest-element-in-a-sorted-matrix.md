---
layout: post
title: Kth Smallest Element in a Sorted Matrix
topics: [array, binary-search]
langs: [java, py, cpp, kt]
tc: O(n+m)
sc: O(1)
leetid: 378
difficulty: medium
companies: [facebook]
gfg: 
hackerrank: 
interviewbit: 
leetcode: kth-smallest-element-in-a-sorted-matrix
---

Given an `n x n` matrix where each of the rows and columns is sorted in ascending order, 
return the k<sup>th</sup> smallest element in the matrix.

Note that it is the k<sup>th</sup> smallest element in the sorted order, 
not the k<sup>th</sup> distinct element.

---

## How to Solve

### Algorithm
- Start with `left = minOfMatrix = matrix[0][0]` and `right = maxOfMatrix = matrix[n-1][n-1]`. 
- Find the `mid` of the `left` and the `right`. This middle number is **NOT necessarily** an element in the matrix. 
- If `countLessOrEqual(mid) >= k`, we keep current `ans = mid` and try to find smaller value by searching on the left side. Otherwise, we search on the right side. 
- Since `ans` is the smallest value which `countLessOrEqual(ans) >= k`, so it's the k<sup>th</sup> smallest element in the matrix.

### How to count number of elements less or equal to x efficiently?
- Since our `matrix` is sorted in ascending order by rows and columns. 
- We use two pointers, one points to the rightmost column `c = n-1`, and one points to the lowest row `r = 0`.
  - If `matrix[r][c] <= x` then the number of elements in row `r` less or equal to `x` is `(c+1)` (Because `row[r]` is sorted in ascending order, so if `matrix[r][c] <= x` then `matrix[r][c-1]` is also <= `x`). 
  Then we go to next row to continue counting.
  - Else if `matrix[r][c] > x`, we decrease column c until `matrix[r][c] <= x` (Because column is sorted in ascending order, so if `matrix[r][c] > x` then `matrix[r+1][c]` is also > `x`). 
- Time complexity for counting: `O(M+N)`.

---

## Test Cases

**Input:**
```
(int[]) matrix = [[1,5,9],[10,11,13],[12,13,15]]
(int) k = 8
```

**Output:**
```
(int) 13
```

**Explanation:**
```
The elements in the matrix are [1,5,9,10,11,12,13,13,15], 
and the 8th smallest number is 13
```