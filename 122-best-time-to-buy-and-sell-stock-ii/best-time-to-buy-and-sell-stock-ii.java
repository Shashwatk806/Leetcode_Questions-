class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int totalProfit = 0;
        buy = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy) buy=prices[i];
            else{
                totalProfit += prices[i]-buy;
                buy=prices[i];
            }
        }
        return totalProfit;
    }
}