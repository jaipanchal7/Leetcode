class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // TC : O(n)
        // SC : O(n)
        HashSet<Integer> set = new HashSet<>(); 
        for(int i = 0 ; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}