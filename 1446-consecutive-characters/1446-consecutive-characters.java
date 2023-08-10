class Solution {
    public int maxPower(String s) {
        
        int res=1,c=1;
        
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
                res = Math.max(res,c);
            }
            else{
                c = 1;
            }
        }
        
        res = Math.max(res,c);
        
        return res;
        
//         int count = 0, maxCount = 0;
//         char previous = ' ';
//         for (int i=0; i<s.length(); i++){
//             char c = s.charAt(i);
//             if (c==previous) 
//                 count++;
//             else{
//                 count=1;
//                 previous=c;
//             }
//             maxCount=Math.max(maxCount,count);
//         }
        
//         return maxCount; 
                
    }
}