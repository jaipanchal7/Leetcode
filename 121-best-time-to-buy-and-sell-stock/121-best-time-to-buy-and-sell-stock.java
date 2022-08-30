class Solution {
    public int maxProfit(int[] prices) {
        // TC : 0(n2) SC : 0(1)
//        int max = 0;
        
//         for(int i=0; i<prices.length; i++){
//                for(int j=i+1; j<prices.length; j++){
//                    if(prices[j]>prices[i]){
//                        int diff = prices[j]-prices[i];
//                        if(diff>max)
//                            max = diff;
//                    }
//                }
//         }
//         return max;
        
        
        // TC : 0(n) SC : 0(1)
        int profit = 0, current = prices[0];
        for (int i = 1; i < prices.length; i++){
            if ( prices[i] < current ){
                current = prices[i];
            }                        
            else {
                profit = Math.max(profit, prices[i] - current);
            }
        }
                
        return profit;
    }
}

