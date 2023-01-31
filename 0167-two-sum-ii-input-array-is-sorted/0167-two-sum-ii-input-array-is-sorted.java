class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // TC : O(n)
        int[] result = new int[2];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                result[0] = map.get(target - numbers[i])+1; // gives value of hashmap, i.e. index
                result[1] = i+1;

                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
        
        // TC : O(n2)
        // int[] arr = new int[2];
        // for (int i = 0; i < numbers.length; i++) {
        //     for (int j = (i+1); j < numbers.length; j++) {
        //         if (numbers[i]+numbers[j]==target){
        //             arr[0]=i+1;
        //             arr[1]=j+1;
        //         }
        //     }
        // }
        // return arr;
    }
}