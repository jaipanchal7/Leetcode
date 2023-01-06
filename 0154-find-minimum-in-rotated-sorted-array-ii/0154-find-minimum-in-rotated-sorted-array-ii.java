class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) 
            return -1;

        int n = nums.length;
        int start = 0, end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[end]) // right is sorted
                end = mid; // as mid element is a potential candidate for being the min
            else if (nums[mid] > nums[end])
                start = mid + 1; // mid is not a candidate, as we are looking for min value
            else
                end--; // duplicates removal as mid matched with end
        }
        return nums[start];
    }
}