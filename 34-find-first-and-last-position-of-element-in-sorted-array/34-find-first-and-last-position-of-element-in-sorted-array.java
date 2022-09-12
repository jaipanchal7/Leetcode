class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] sol = new int[2];
        int left = binarySearch(nums, 0, nums.length-1, target, 0);
        int right = binarySearch(nums, 0, nums.length-1, target, 1);
        sol[0] = left;
        sol[1] = right;
        return sol;
    }
    
	//Direction 1 means keep going right
	//Direction = 0 means keep going left;
    public int binarySearch(int[] nums , int low, int high, int target, int direction)
    {
        int index = -1;
        if(nums.length == 0)
             return index;
        while (low <= high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid] < target)
                low = mid + 1;
            else if(nums[mid] > target)
                high = mid - 1;
            else {
                index = mid;
                if(direction == 1)
                    low = mid + 1;
                else
                    high = mid - 1;
            }    
        }
        return index;
    }
}