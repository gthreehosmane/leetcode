class Solution {
    public int maxProfit(int[] prices) {
        int l = Integer.MAX_VALUE;
        int current_profit = 0;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<l)
                l = prices[i];
            current_profit = prices[i]-l;
            if(current_profit>profit)
                profit = current_profit;
        }
        return profit;
    }
}