class Solution {
    public int majorityElement(int[] nums) {
        
        // Using Hashmap
        // Time Complexity :- O(nlogn)
	    // Space Complexity :- O(1)
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        
        int ans = 0;
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/2){
                ans = key;
            }
        }
        return ans;
        
        
        //Brute Force Method
	    // Time Complexity :- O(N^2)
	    // Space Complexity :- O(1)
//         int count = 0;
//         int element = nums[0];
//         int freq = 1;
        
//         for(int i=1; i<nums.length; i++){
//             if(freq == 0){
//                 element = nums[i];
//                 freq = 1;
//             }
//             else if(nums[i] == element){
//                 freq++;
//             }
//             else{
//                 freq--;
//             }
//         }
//         return element;
        
        
        // Sorting
        // Arrays.sort(nums);
        // return nums[(nums.length-1)/2];
    }
}