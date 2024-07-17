class Solution {
    public int maxProfit(int[] prices) {
        int smallest=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++)
        {
            maxProfit=Math.max(maxProfit,prices[i]-smallest);
            smallest=Math.min(smallest,prices[i]);
        }
        return maxProfit;
    }
}