class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int r = nums[n-1] * nums[n-2] * nums[n-3]; //to check right subarray (for +ve numbers)
        int l = nums[0] * nums[1] * nums[n-1]; //to check left subarray (for -ve numbers)
        
        return Math.max(l,r);
    }
}