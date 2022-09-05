class Solution {
    public int maxSubArray(int[] nums) {
        
        // if(nums.length==1){
        //     return nums[0];
        // }
        
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        for (int i=0; i<nums.length; i++){
            currsum = currsum + nums[i];
            
            if(currsum>maxsum){
                maxsum = currsum;
            }
            
            if(currsum<0){
                currsum = 0;
            }
        }
        return maxsum;
        
    }
}