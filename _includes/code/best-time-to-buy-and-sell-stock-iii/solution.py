class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ob, tb = float('-inf'), float('-inf')
        obos, tbts = 0, 0
        for price in prices:
            ob = max(ob, -price)
            obos = max(obos, ob + price)
            tb = max(tb, obos - price)
            tbts = max(tbts, tb + price)
        return max(obos, tbts)