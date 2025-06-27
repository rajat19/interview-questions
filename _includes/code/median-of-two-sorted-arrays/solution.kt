class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val n1 = nums1.size
        val n2 = nums2.size

        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1)
        }

        var start = 0
        var end = n1

        while (start <= end) {
            val mid1 = start + (end - start) / 2
            val mid2 = (n1 + n2 + 1) / 2 - mid1

            val left1 = if (mid1 == 0) Int.MIN_VALUE else nums1[mid1 - 1]
            val left2 = if (mid2 == 0) Int.MIN_VALUE else nums2[mid2 - 1]

            val right1 = if (mid1 == n1) Int.MAX_VALUE else nums1[mid1]
            val right2 = if (mid2 == n2) Int.MAX_VALUE else nums2[mid2]

            if (left1 <= right2 && left2 <= right1) {
                if ((n1 + n2) % 2 == 0) {
                    return (maxOf(left1, left2).toDouble() + minOf(right1, right2).toDouble()) / 2.0
                } else {
                    return maxOf(left1, left2).toDouble()
                }
            }
            if (left1 > right2) {
                end = mid1 - 1
            } else {
                start = mid1 + 1
            }
        }
        return -1.0 // Return a Double consistent with the function's return type
    }
}