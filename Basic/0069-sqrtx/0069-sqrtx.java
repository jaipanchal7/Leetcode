class Solution {
    public int mySqrt(int x) {
        long a=0;
        
        while(a*a<=x){
            a++;
        }
        
        return (int)(a-1);  
        
        // int ans = (int)Math.sqrt(x);
        // return ans;
    }
}