class Solution {
    public int longestOnes(int[] nums, int k) {
        int windowLeft = 0, windowRight = 0;
        int bestWindow = 0, bestLeft = 0;
        int n = nums.length, zeroCount = 0;
        while(windowRight < n) {
            if (zeroCount <= k) {
                if (nums[windowRight] == 0) zeroCount++;
                windowRight++;
            }
            if (zeroCount > k) {
                if (nums[windowLeft] == 0) zeroCount--;
                windowLeft++;
            }
            if (windowRight-windowLeft > bestWindow && zeroCount <= k) {
                bestWindow = windowRight-windowLeft;
                bestLeft = windowLeft;
            }
        }
        return bestWindow;

    }
}