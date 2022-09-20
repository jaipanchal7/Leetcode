class Solution {
    public boolean isPowerOfFour(int n) {
        // base case
        if(n == 1){
            return true;
        }
        
        if(n<1 || (n%4 != 0)){
            return false;
        }    
        
        // keep divided by 4
        return isPowerOfFour(n/4);
    }
}