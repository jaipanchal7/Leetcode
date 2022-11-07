class Solution {
    public int maximum69Number (int num) {
        
        // TC : O(n) , SC : O(n) 
        char[] chArr = String.valueOf(num).toCharArray();
        for (int i=0; i<chArr.length; i++)
            if (chArr[i] == '6'){
                chArr[i] = '9'; 
                break; 
            }
        return Integer.valueOf(String.valueOf(chArr));
        
    //     String s = new String(num + "");
    //     s = s.replaceFirst("[6]","9");
    //     return Integer.parseInt(s);
    }
}