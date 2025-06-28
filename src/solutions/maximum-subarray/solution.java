class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int n: nums) {
            sum += n;
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }
        return max;
    }
}