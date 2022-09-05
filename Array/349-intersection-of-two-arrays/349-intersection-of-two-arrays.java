class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> x1 = new HashSet<>();
        Set<Integer> x2 = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
                x1.add(nums1[i]);            
        }
        
        for(int i=0; i<nums2.length; i++){
                x2.add(nums2[i]);            
        }
        
        x1.retainAll(x2);
        
        int[] arr = new int[x1.size()];
        
        int i=0;
        for(int num : x1){
            arr[i] = num;
            i++;
        }
        return arr;
    }
}