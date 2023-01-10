class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        
        return hcf(nums[0],nums[nums.length-1]);
    }
    
    // Euclid's Algo
    // GCD(x,y) = GCD(y,x%y)
    // GCD(x,0) => x (Base Case)
    public int hcf(int a,int b){
        if(b == 0)
            return a;
        
        return hcf(b,a%b);
    }
}