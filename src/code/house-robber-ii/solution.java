class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(rob(nums, 0, nums.length-2), rob(nums, 1, nums.length-1));
    }

    private int rob(int[] nums, int start, int end) {
        int first = 0, second = 0;
        for(int i=start; i<=end; i++) {
            int temp = Math.max(first + nums[i], second);
            first = second;
            second = temp;
        }
        return second;
    }
}