class Solution {
    public int specialArray(int[] nums) {
        for (int i = 0; i<nums.length + 1; i++){
            int count = 0;
            for (int j = 0; j<nums.length; j++){
                if (i<=nums[j]){
                    count ++;
                }
            }
            if (count == i){
                return count;
            }
        }
        return -1;
    }
}