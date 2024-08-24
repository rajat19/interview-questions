class Solution {
    int[] days, costs, durations, memo;
    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.costs = costs;
        this.durations = new int[]{1, 7, 30};
        this.memo = new int[days.length];
        Arrays.fill(memo, -1);
        return dp(0);
    }

    private int dp(int i) {
        if (i >= days.length) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        int ans = Integer.MAX_VALUE;
        int j = i;
        for(int k=0; k<3; k++) {
            while(j < days.length && days[j] < days[i] + durations[k]) {
                j++;
            }
            ans = Math.min(ans, dp(j) + costs[k]);
        }
        memo[i] = ans;
        return ans;
    }
}