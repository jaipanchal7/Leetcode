class Solution {
    public int search(int[] nums, int target) {
        
        
        if (nums==null || nums.length==0) {
            return -1;
        }
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[l]<=nums[mid]){ 
                if(nums[l]<=target && target<nums[mid]){ 
                    r=mid-1;                              
                }else 
                    l=mid+1;
            }else{  
                if(nums[mid]<target && target<=nums[r]){ 
                    l=mid+1;     
                }else{
                    r=mid-1;
                }
            }
        }
        return nums[l] == target ? l : -1;
        
        
//         int s = 0;
//         int e = nums.length-1;
        
//         while(s<=e){
//             int mid = (s+e)/2;
//             if(target==nums[mid]){
//                 return mid;
//             }
//             else if (target>nums[mid]){
//                 s = mid+1;
//             }
//             else{
//                 e = mid-1;
//             }
//         }
//         return -1;       
        
    }
}