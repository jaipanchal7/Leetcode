class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
		
		//converting to uppercase and removing all "-"
        s = s.toUpperCase();
        s = s.replaceAll("-","");
        
		//count for keeping track of K elements
        int count = 0;
        for(int i=s.length()-1; i>=0 ; i--){
		//append characters after k elements and reset the counter
            if(count == k){
                sb.append('-');
                count = 0;
            }
            sb.append(s.charAt(i));
            count++;
        }
		//reverse the sb string 
        return sb.reverse().toString();
    }
}