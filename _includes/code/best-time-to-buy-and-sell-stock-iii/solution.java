import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int oneBuy = Integer.MIN_VALUE, oneBuyOneSell = 0;
        int twoBuy = Integer.MIN_VALUE, twoBuyTwoSell = 0;
        for(int i=0; i<prices.length; i++) {
            oneBuy = Math.max(oneBuy, -prices[i]);
            oneBuyOneSell = Math.max(oneBuyOneSell, oneBuy + prices[i]);
            twoBuy = Math.max(twoBuy, oneBuyOneSell -prices[i]);
            twoBuyTwoSell = Math.max(twoBuyTwoSell, twoBuy + prices[i]);
        }
        return Math.max(oneBuyOneSell, twoBuyTwoSell);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = new int[]{3,3,5,0,0,3,1,4};
        System.out.println(solution.maxProfit(prices));
    }
}