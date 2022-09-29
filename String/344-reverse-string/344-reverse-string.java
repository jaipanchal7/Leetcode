class Solution {
    public void reverseString(char[] s) {
        
        Stack<Character> str = new Stack<>();
        
        for(int i=0; i<s.length; i++){
            str.push(s[i]);
        }
        
        for(int i=0; i<s.length; i++){
            s[i] = str.pop();
        }
        // return str;
        
        
//         int start=0;
//         int end=s.length-1;
        
//         while(start<end){
//             char temp = s[end];
//             s[end] = s[start];
//             s[start] = temp;
//             start++;
//             end--;
//         }    
    }
}