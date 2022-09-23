import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger str1 = new BigInteger(num1);
        BigInteger str2 = new BigInteger(num2);
        
        BigInteger ans = str1.multiply(str2);
        return String.valueOf(ans); // convert string to int
        // return ans.toString(); // this one also
    }
}