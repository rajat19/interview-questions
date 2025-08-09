class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ml = Integer.MAX_VALUE;
        int start = 0, end = 0, curr = 0;
        while(end < nums.length) {
            curr += nums[end];
            while(curr >= target) {
                ml = Math.min(ml, end-start+1);
                curr -= nums[start++];
            }
            end++;
        }
        return ml == Integer.MAX_VALUE ? 0 : ml;
    }
}