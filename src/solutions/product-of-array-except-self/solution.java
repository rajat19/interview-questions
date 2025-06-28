class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] out = new int[l];
        out[0] = 1; out[l-1] = 1;
        for(int i=1; i<l; i++) {
            out[i] = nums[i-1]*out[i-1];
        }
        int m=1;
        for(int i=l-1; i>=0; i--) {
            out[i] = m*out[i];
            m *= nums[i];
        }
        return out;
    }
}