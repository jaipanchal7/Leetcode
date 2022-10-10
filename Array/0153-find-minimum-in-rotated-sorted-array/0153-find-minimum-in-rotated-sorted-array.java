class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length == 2){
            return Math.min(nums[0], nums[1]);
        }
        
        while(start <= end){
            
            if(nums[start] < nums[end]){
                return nums[start];
            }
            
            int mid = start + (end - start)/2;
            
            if(nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }
            if(nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            
            if(nums[mid] < nums[end]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            
        }
        return 0;
    }
}