class Solution {
    public boolean isPalindrome(int x) {
        
        int reversed = 0;
        int original = x;
        int rem = 0;
        
        while (x > 0) {  // while(x!=0 && x>0) 
            rem = x % 10;
            reversed = reversed*10 + rem;
            x /= 10;            
        }
        
        return original == reversed;
    }
}