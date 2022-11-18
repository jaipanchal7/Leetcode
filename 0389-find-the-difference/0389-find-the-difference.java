class Solution {
    public char findTheDifference(String s, String t) {
        
        int s1=0,s2=0;
        
        for(int i=0; i<s.length(); i++){
            s1 = s1 + s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            s2 = s2 + t.charAt(i);
        }
        return (char) (s2-s1);
        
        
        // char addChar = 0;
        // int i=0;
        // while(i<s.length()){
        //     addChar ^= s.charAt(i);
        //     i++;            
        // }
        // int j=0;
        // while(j<t.length()){
        //     addChar ^= t.charAt(j);
        //     j++;            
        // }
        // return addChar;

        
//         HashSet<String> hs = new HashSet<>();
//         for(int i=0; i<s.length(); i++){
//             hs.add(String.valueOf(s.charAt(i)));
//         }
        
//         for(int i=0; i<t.length(); i++){
//             if(hs.contains(String.valueOf(t.charAt(i)))){
//                 continue;
//             }else{
//                 char ans = t.charAt(i);
//                 return ans;
//             }
//         }
//         return t.charAt(0);
        
    }
}