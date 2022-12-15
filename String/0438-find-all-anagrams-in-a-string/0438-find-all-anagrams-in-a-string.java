class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> res = new ArrayList<>();
        
        if (p.length() > s.length()) {
            return Collections.emptyList();
        }

        for (int i = 0; i < s.length()-p.length()+1; i++){
            if (checkArray(s.substring(i, i + p.length()), p)){
                res.add(i);
            }
        }
        return res; 
    }

     public static boolean checkArray(String s, String t){
        int[] chars = new int[26];

        for (char current : s.toCharArray()){
            int z = current - 'a';
            chars[z]++;
        }

        for (char current : t.toCharArray()){
            chars[current - 'a']--;
        }

        for (int current : chars){
            if (current != 0) {
                return false;
            }
        }
        return true;
    }
}