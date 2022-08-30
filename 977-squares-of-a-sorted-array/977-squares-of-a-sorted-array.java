class Solution {
    public int[] sortedSquares(int[] nums) {
        
        
        // for O(nlogn) TC and SC is 0(1)
//         int n = nums.length;
        
//         for (int i = 0; i<n; i++){
//             nums[i] = nums[i] * nums[i];
//         }
        
//         Arrays.sort(nums);
        
//         return nums;
        
        int n = nums.length;
        
        for (int i = 0; i<n; i++){
            nums[i] = nums[i] * nums[i];
        }
        
        int s = 0;
        int e = nums.length-1;
        
        int[] arr = new int[n];
        int i=0;
        for(int j = n-1; j>=0; j--){
            if(nums[s]>nums[e]){
                arr[j] = nums[s];
                s++;       
            }
            else{
                arr[j] = nums[e];
                e--;
            }
        } 
        return arr;      
    }
}