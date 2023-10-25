class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit = 0;
       int minPrice = Integer.MAX_VALUE;
       
        for (int i = 0; i < prices.length; i++) {
            final int price = prices[i];
            if (price < minPrice) {
                minPrice = price;
            } else {
                int temp = price - minPrice;
                maxprofit = temp > maxprofit ? temp : maxprofit;
            }
            
        }
        return maxprofit;
    }
}
