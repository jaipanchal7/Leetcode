class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum=0;
        int count=0;
        
        Arrays.sort(costs);
        
        for(int i=0; i<costs.length; i++){
            sum = sum + costs[i];
            count++;
            
            if(sum==coins)
                return count;
            if(sum>coins)
                return count-1;
        }
        
        return count;
        
//         Arrays.sort(costs);
        
//         for(int i=0; i<costs.length; i++){
//             if((coins = coins - costs[i])<0) 
//                 return i;
//         }
        
//         return costs.length;
    }
}