class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int oneBuy = INT_MIN, oneBuyOneSell = 0;
        int twoBuy = INT_MIN, twoBuyTwoSell = 0;
        for(int i=0; i<prices.size(); i++) {
            oneBuy = max(oneBuy, -prices[i]);
            oneBuyOneSell = max(oneBuyOneSell, oneBuy + prices[i]);
            twoBuy = max(twoBuy, oneBuyOneSell -prices[i]);
            twoBuyTwoSell = max(twoBuyTwoSell, twoBuy + prices[i]);
        }
        return max(oneBuyOneSell, twoBuyTwoSell);
    }
};