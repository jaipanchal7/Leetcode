class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> charSet = new Stack<>();
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') 
                charSet.push(c);
            
            else if (charSet.size() > 0){
                if (((charSet.peek() == '(' && c == ')') ||
				(charSet.peek() == '{' && c == '}') || 
				(charSet.peek() == '[' && c == ']'))){
                    charSet.pop();
                }
                else 
                    return false;
                }
            
            else 
                return false;
        }
        return charSet.empty();
    }
}