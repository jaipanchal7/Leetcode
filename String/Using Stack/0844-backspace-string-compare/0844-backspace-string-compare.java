class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backspaced(s).equals(backspaced(t));
    }

    public String backspaced(String str){
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c != '#') {
                stack.push(c);
            }
            else if (stack.isEmpty() == false) {  // (!stack.isEmpty())
                stack.pop();
            }
        }

        return stack.toString();
    }
}