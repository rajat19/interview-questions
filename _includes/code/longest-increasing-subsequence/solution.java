class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        int size = 0;
        for(int i=0; i<n; i++) {
            int start = 0, end = size;
            while(start != end) {
                int mid = start + (end-start)/2;
                if (lis[mid] < nums[i]) {
                    start = mid+1;
                } else {
                    end = mid;
                }
            }
            lis[start] = nums[i];
            if (start == size) ++size;
        }
        return size;
    }
}