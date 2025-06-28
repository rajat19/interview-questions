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

/**
 * Alternate solution that handles zeros:
 * class Solution {
 *     public int[] productExceptSelf(int[] nums) {
 *         int[] result = new int[nums.length];
 *         int countZero = 0, indexZero = 0, product = 1;
 *
 *         for (int i = 0; i < nums.length; i++) {
 *             if (nums[i] == 0) {
 *                 countZero++;
 *                 indexZero = i;
 *             } else {
 *                 product *= nums[i];
 *             }
 *         }
 *
 *         if (countZero > 1) {
 *             return result;
 *         } else if (countZero == 1) {
 *             result[indexZero] = product;
 *             return result;
 *         } else {
 *             for (int i = 0; i < nums.length; i++) {
 *                 result[i] = product / nums[i];
 *             }
 *         }
 *
 *         return result;
 *     }
 * }
 */