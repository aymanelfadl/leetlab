class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        buyingDay = prices[0]

        for price in prices:
            if price < buyingDay:
                buyingDay = price
            else:
                profit = max(profit, price - buyingDay)

        return profit