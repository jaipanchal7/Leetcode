class Solution {
    public List<Integer> majorityElement(int[] nums) {
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
        List<Integer> ls = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/3){
                ls.add(key);
            }
        }
        return ls;
    }
}