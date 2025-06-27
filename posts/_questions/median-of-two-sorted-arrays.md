---
layout: post
title: Median of Two Sorted Arrays
topics: [array, binary-search, divide-and-conquer]
langs: [java, cpp, py, kt, ts]
tc: O(log(m+n))
sc: O(1)
leetid: 4
gfg: median-of-two-sorted-arrays-of-different-sizes
companies: [facebook]
difficulty: hard
hackerrank: 
interviewbit: 
leetcode: median-of-two-sorted-arrays
---

Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays, in `O(log n + log m)` time complexity, 
when n is the number of elements in the first array, and m is the number of elements in the second array.

---
## How to Solve

1. Let assume that there are two arrays `A` and `B` with array `A` having the minimum number of elements.
   If this is not the case than swap `A` and `B` to make `A` having small size.
2. The edge cases like one array is empty or both are empty will be handled.
   1. let `n` be the size of `A` and `m` be the size of `B`. 
   2. Now think of an idea that if we have to find the median than we have to divide the whole merged array into two parts
   namely `left` and `right` parts. 
   3. Now since we are given the size of left part (i.e (n+m+1)/2), Now look at below given example.
      ```
      A-> 1,2,3,4,5     n = 5
      B-> 1,2,3,4,5,6   m = 6
      ```

      Here merged array will look like :- <span style="color:orange;">1,1,2,2,3</span>,3,<span style="color:green;">4,4,5,5,6</span> 
      and median then is `3`
   
   4. Now we can see our left part which is in <span style="color:orange;">orange</span>. 
   5. We divide A and B into two parts such that the sum of left part of both A and B will result in left part of merged array.
      ```
      A-> 1,2,3,4,5     // pointers l =0 and r = n-1 hence mid = (l+r)/2;
      B -> 1,2,3,4,5,6
      ```
      we can see that left part of A is given as `n/2` and since total length of left part in merged array
      is `(m+n+1)/2`, so left part of B = `(m+n+1)/2-n/2`;

      Now we just have to confirm if our left and right partitions in `A` and `B` are correct or not.

3. Now we have 4 variables indicating four values two from array A and two from array B.
   ```   
   leftA -> Rightmost element in left part of A = 2
   leftb -> Rightmost element in left part of B = 4
   rightA -> Leftmost element in right part of A = 3
   rightB -> Leftmost element in right part of B = 5
   ```

   Hence to confirm that partition is correct we have to check the following conditions.

   `leftA<=rightB` and `leftB<=rightA`  // This is the case when the sum of two parts of A and B results in left part of merged array

   if our partition not works that means we have to  find other mid point in A and then left part in B
   This is seen when
   ```
   leftA > rightB    //means we have to dec size of A's partition
   so do r = mid-1;
   else
   do l =mid+1;
   ```

   Hence repeat the above steps with new partitions till we get the answers.

4. If `leftA<=rightB` and `leftB<=rightA`
   then we get correct partition and our answer depends on the total size of merged array (i.e. m+n)
   ```
   If (m+n)%2==0
   ans is max(leftA,leftB)+min(rightA,rightB)/2; // max of left part is nearest to median and min of right part is nearest to medain
   else
   ans is max(leftA,leftB);
   ```

---
## Test Cases

**Example 1:**
```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
```

**Example 2:**
```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
```