class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        
        return sb.toString();
        
    }
}