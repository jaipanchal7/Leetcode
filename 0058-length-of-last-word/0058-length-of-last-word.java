class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        int ans = str.length-1;
        return str[ans].length();
    }
}