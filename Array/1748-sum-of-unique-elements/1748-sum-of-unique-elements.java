import java.util.*; 
class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        int sum = 0;
        for(int i = 0; i<nums.length ; i++){
            if(set.contains(nums[i])){
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }     
            }
            else{
                set.add(nums[i]);
                sum = sum + nums[i];
            }
        }
        int i = 0;
        while(i <list.size()){
            sum = sum - list.get(i);
            i++;
        }
        return sum;
        
//         Set<Integer> x = new HashSet<>();
//         ArrayList<Integer> l1 = new ArrayList<>();
        
//         for(int i=0; i<nums.length; i++){
//             if(x.contains(nums[i])){
//                 // l1.add(nums[i]);
//                 x.remove(nums[i]);
                
//             }
//             else{
//                 x.add(nums[i]);
//                 l1.add(nums[i]);
//             }
//         }
//         int sum=0;
//         for(int num : l1){
//             sum = sum + num;
//         }
        
//         return sum;
        
        
        //for each
//         for(int i : nums){
//             if(x.contains(i)){
//                 x.remove(i);
//             }else
//             x.add(i);
//         }
        
//         int sum=0;
//         for(int num : x){
//             sum = sum + num;
//         }
//         return sum;
    }
}
        // x.forEach(x->System.out.println("Hi"));    