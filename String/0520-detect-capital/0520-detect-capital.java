class Solution {
    public boolean detectCapitalUse(String word) {
        int upper=0;
        int n = word.length();
        
        for(int i=0; i<n; i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                upper++;
            }
        }
        
        if(upper == 0 || upper == n) 
            return true;
        else if(upper == 1 && word.charAt(0)>='A' && word.charAt(0)<='Z') 
            return true;
        else 
            return false;
    }
}