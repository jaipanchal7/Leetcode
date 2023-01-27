class Solution {
    public int countAsterisks(String s) {
        int asteriskCount = 0;
        int barCount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '|')
                barCount++;
            if(barCount%2==0 && s.charAt(i) =='*')
                asteriskCount++;
        }
        return asteriskCount;
    }
}