class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length; // for length of array is less to k
        if(k < 0){ // for -ve value
            k += nums.length;
        }
        
         //rotate the whole array
        rev(nums, 0, nums.length - 1);

        //K part reversal
        rev(nums, 0, k-1);

        //Non K part reversal
        rev(nums, k, nums.length - 1);
    }

    public void rev(int[] arr, int i, int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}