class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();

        // Iterate over each character in the stack and append it to the StringBuilder
        for (char c : stack) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}