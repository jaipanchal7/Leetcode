class Solution {
    public boolean checkZeroOnes(String s) {
        
        int countOnes = 0, checkOnes = 0;
        int checkZeros =0, countZeros= 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                countZeros = 0;
                countOnes++;
                checkOnes = Math.max(checkOnes, countOnes);
            }
            else{
                countOnes = 0;
                countZeros++;
                checkZeros = Math.max(checkZeros, countZeros);
                
            }
        }
        return checkOnes>checkZeros;
    }
}