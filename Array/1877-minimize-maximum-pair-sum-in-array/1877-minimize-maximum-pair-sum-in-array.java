class Solution {
    public int minPairSum(int[] nums) {
        
        //TC : O(nlogn), SC : O(1)
        
        Arrays.sort(nums);
        int s = 0;
        int l = nums.length-1;
        int sum = 0;
        int msum = 0;
        
        while(s<l){
            sum = nums[s] + nums[l];
            s++;
            l--;
            msum = Math.max(msum,sum);
        }
        return msum;
        
//         Arrays.sort(nums);
        
//         int maxVal = 0;
        
//         for(int i=0; i<nums.length/2; i++){
//             maxVal = Math.max(maxVal, nums[i] + nums[nums.length-i-1]);
//         }
//         return maxVal;
    }
}