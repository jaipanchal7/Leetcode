public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        // TC : O(1)
        int count=0;
        int a=1;
        for (int i=0; i<32; i++){
            if((n & a)!=0)
                count++;
            a<<=1;
        }
        return count;
        
        
        // TC: O(N * logN) => O(32 * log32) => O(1)
        // String s = Integer.toBinaryString(n).replaceAll("0", "");
        // return s.length();
    }
}