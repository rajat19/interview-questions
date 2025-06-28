class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i, l, buy, sell, profit = 0, len(prices) - 1, 0, 0, 0
        while i < l:
            while i < l and prices[i+1] <= prices[i]:
                i+=1
            buy = prices[i]
            while i < l and prices[i+1] > prices[i]:
                i+= 1
            sell = prices[i]
            profit += sell - buy
        return profit
        