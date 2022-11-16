class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if (k == 0) 
            return false;

        Set<Integer> set = new HashSet<>();
        
        for (int i=0; i<nums.length; i++){
            if (set.contains(nums[i]))
                return true;
            
            if (i >= k)
                set.remove(nums[i - k]);
            
            set.add(nums[i]);
        }
        return false;
        
        
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1,m=0; j<nums.length && m<k; j++,m++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}