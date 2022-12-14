class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // TC : O(n)
        int[] result = new int[2];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]); // gives value of hashmap, i.e. index
                result[1] = i;

                return result;
            }
            map.put(nums[i], i);
        }
        return result;
        
        
        
        // TC : O(n2) 
        // int[] arr = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = (i+1); j < nums.length; j++) {
        //         if (nums[i]+nums[j]==target){
        //             arr[0]=i;
        //             arr[1]=j;
        //         }
        //     }
        // }
        // return arr;
    }
}