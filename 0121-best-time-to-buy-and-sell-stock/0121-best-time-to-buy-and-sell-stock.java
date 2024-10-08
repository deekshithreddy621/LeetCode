class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minEle = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minEle){
                minEle = prices[i];
            }
            else{
                profit = Math.max(profit, prices[i] - minEle);
            }
        }
        return profit;
    }
}