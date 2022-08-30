class Solution {
    public int findDuplicate(int[] nums) {
        
    //     int len = nums.length;
    //     int duplicate = 0;
    //     for (int i = 0; i < len-1; i++) {
    //         for (int j = i + 1; j < len; j++) {
    //             if (nums[i] == nums[j]) {
    //                 duplicate =  nums[i];
    //             }
    //         }
    //     }
    //     return duplicate;        
    // }
        
        Arrays.sort(nums);
        int n = nums.length;
        int duplicate=0;
        for(int i =0;i<n-1;i++){
            if(nums[i]==nums[i+1])
                duplicate = nums[i];
        }
        return duplicate;
    }
}