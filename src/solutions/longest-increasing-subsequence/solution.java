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

/*
Alternate solution using DP

class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLen = Arrays.stream(dp).max().getAsInt();
        return maxLen;
    }
}

*/