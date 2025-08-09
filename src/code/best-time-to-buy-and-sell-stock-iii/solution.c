int max(int a, int b) {
    return a > b ? a: b;
}

int maxProfit(int* prices, int pricesSize) {
    int firstBuy = INT_MIN, firstSell = 0;
    int secondBuy = INT_MIN, secondSell = 0;
    for(int i = 0; i< pricesSize; i++) {
        firstBuy = max(firstBuy, -prices[i]);
        firstSell = max(firstSell, firstBuy + prices[i]);
        secondBuy = max(secondBuy, firstSell - prices[i]);
        secondSell = max(secondSell, secondBuy + prices[i]);
    }
    return max(firstSell, secondSell);
}