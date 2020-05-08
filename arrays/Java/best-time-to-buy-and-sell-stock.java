class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        if(prices.length <2) //check edge case input
            return maxProfit;
        int minPrice=prices[0];
        for(int i=1;i<prices.length;i++) {
                int currProfit=(prices[i]-minPrice);
                maxProfit=Math.max(maxProfit,currProfit);
            minPrice=Math.min(minPrice,prices[i]);
        }
        return maxProfit;
    }
}
