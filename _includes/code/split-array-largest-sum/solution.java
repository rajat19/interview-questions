class Solution {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        int[][] memo = new int[n+1][m+1];
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int subarrayCount = 1; subarrayCount <= m; subarrayCount++) {
            for (int currIndex = 0; currIndex < n; currIndex++) {
                if (subarrayCount == 1) {
                    memo[currIndex][subarrayCount] = prefixSum[n] - prefixSum[currIndex];
                    continue;
                }

                int minimumLargestSplitSum = Integer.MAX_VALUE;
                for (int i = currIndex; i <= n - subarrayCount; i++) {
                    int firstSplitSum = prefixSum[i + 1] - prefixSum[currIndex];
                    int largestSplitSum = Math.max(firstSplitSum, memo[i + 1][subarrayCount - 1]);
                    minimumLargestSplitSum = Math.min(minimumLargestSplitSum, largestSplitSum);
                    if (firstSplitSum >= minimumLargestSplitSum) {
                        break;
                    }
                }
                memo[currIndex][subarrayCount] = minimumLargestSplitSum;
            }
        }

        return memo[0][m];
    }
}