class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = new int[arr.length];
        
        for(int i=0 ; i<nums.length; i++){
            nums[i] = arr[i];
        }
        
        Arrays.sort(nums);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int j = 1;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],j);
                j++;
            }
        }
        
        for(int i=0 ; i<nums.length; i++){
            System.out.print(arr[i] + " ");
            System.out.println(map.get(arr[i]));
            nums[i] = map.get(arr[i]);
        }
        
        return nums;
    }
}