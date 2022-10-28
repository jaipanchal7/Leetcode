class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int j=0;
        
        for(int i=0; j<g.length && i<s.length; i++){
            if(g[j] <= s[i])
                j++;
        }
        return j;
    }
}