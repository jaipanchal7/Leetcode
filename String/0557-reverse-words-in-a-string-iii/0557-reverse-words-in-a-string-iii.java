class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder();
        String trimmed = s.trim();
        String[] arr = trimmed.split(" ");
        
        Stack<String> stack = new Stack<>();
        ArrayList<String> arrString = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            StringBuilder sRev = new StringBuilder(arr[i]);
            arrString.add(sRev.reverse().toString());
            // System.out.println(sRev);
        }
        
        // for checking purpose
        String[] answer = Arrays.copyOf(arrString.toArray(), arrString.size(), String[].class);
        System.out.println(Arrays.toString(answer));
        
        StringBuilder sRes = new StringBuilder();
        for(int i=0; i<arrString.size(); i++){
            sRes.append(new StringBuilder(arrString.get(i)) + " ");
        }

        return sRes.toString().replaceAll("\\s+"," ").trim();
    }
}