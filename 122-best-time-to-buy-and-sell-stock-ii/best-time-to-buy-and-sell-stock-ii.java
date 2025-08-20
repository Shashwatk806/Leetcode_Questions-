class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        int buy = prices[0];
        for(int i =1;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else if(prices[i]>buy){
            int profit = prices[i]-buy;
            buy = prices[i];
            total += profit;
            }
        }
        return total;
    }
}