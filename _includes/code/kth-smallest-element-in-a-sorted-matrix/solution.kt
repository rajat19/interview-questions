class Solution {
    fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
        val m = matrix.size
        val n = matrix[0].size
        var left = matrix[0][0]
        var right = matrix[m-1][n-1]
        var ans = -1
        while(left <= right) {
            val mid = left + (right - left)/2
            if (countLessAndEqual(matrix, m, n, mid) >= k) {
                ans = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return ans
    }

    fun countLessAndEqual(matrix: Array<IntArray>, m: Int, n: Int, element: Int): Int {
        var col = n-1
        var count = 0
        var row = 0
        while (row < m) {
            while(col >= 0 && matrix[row][col] > element) {
                col--
            }
            count += col + 1
            row++
        }
        return count
    }
}