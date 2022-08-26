class Solution {
    public int reverse(int x) {
        
        long sum=0;
        // long rem=0;
        
        while(x!=0){
            // rem = x%10;
            sum = (sum * 10) + x%10;
            x /= 10;
        }
        
        if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)sum;
        }
        
        
    }
}