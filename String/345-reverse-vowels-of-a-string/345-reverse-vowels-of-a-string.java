class Solution {
    public String reverseVowels(String s) {
        
        char[] arr = s.toCharArray();
        int  l = 0;
        int r = arr.length-1;
        
        while(l<=r){
            if(checkVowel(arr[l]) && checkVowel(arr[r])){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            else{
                if(!checkVowel(arr[l])){
                    l++;
                }
                if(!checkVowel(arr[r])){
                    r--;
                }
            }
        }
        return new String(arr);
    }
    
    public boolean checkVowel(char ch){                         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        return true; 
    }else            
          return false;                               
    }
}