from typing import List


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


if __name__ == '__main__':
    prices = [3, 3, 5, 0, 0, 3, 1, 4]
    solution = Solution()
    print(solution.maxProfit(prices))
