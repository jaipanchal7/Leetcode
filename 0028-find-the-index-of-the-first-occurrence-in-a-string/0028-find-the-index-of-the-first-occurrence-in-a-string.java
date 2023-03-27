class Solution {
    public int strStr(String haystack, String needle) {
        
        // TC: O(n ^ 2), SC: O(1)
        int i = 0;
        int j = needle.length();

        while (j < haystack.length() + 1) {
            String s = haystack.substring(i, j);
            
            if (s.equals(needle)) 
                return i;
            
            i++;
            j++;
        }

        return -1;
        
        // TC: O(n * m), SC: O(1)
        // return haystack.indexOf(needle);
    }
}