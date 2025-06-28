class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        mx = amount + 1
        dp = [mx]*mx
        dp[0] = 0
        for i in range(1, amount+1):
            for coin in coins:
                if coin <= i:
                    dp[i] = min(dp[i], 1 + dp[i - coin])
        return -1 if dp[amount] > amount else dp[amount]
