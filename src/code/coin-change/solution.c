int min(int num1, int num2) {
    return (num1 < num2 ) ? num1 : num2;
}

int coinChange(int* coins, int coinsSize, int amount){
    int max = amount + 1;
    int dp[amount+1];
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
        dp[i] = max;
        for(int j=0; j<coinsSize; j++) {
            int coin = coins[j];
            if (coin <= i) {
                dp[i] = min(dp[i], dp[i - coin] + 1);
            }
        }
    }
    return dp[amount] > amount ? -1 : dp[amount];
}