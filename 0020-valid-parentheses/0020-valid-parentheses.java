class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
          if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
            } else{
            if (ch == ')') {
              if (stack.isEmpty() || stack.pop() != '(') {
                return false;
              }
            }
            if (ch == '}') {
              if (stack.isEmpty() || stack.pop() != '{') {
                return false;
              }
            }
            if (ch == ']') {
              if (stack.isEmpty() || stack.pop() != '[') {
                return false;
              }
            }
          }
        }
        return stack.isEmpty();
        
        
//         Stack<Character> charSet = new Stack<>();
        
//         for (int i = 0; i < s.length(); i++){
//             char c = s.charAt(i);
//             if (c == '(' || c == '{' || c == '[') 
//                 charSet.push(c);
            
//             else if (charSet.size() > 0){
//                 if (((charSet.peek() == '(' && c == ')') ||
// 				(charSet.peek() == '{' && c == '}') || 
// 				(charSet.peek() == '[' && c == ']'))){
//                     charSet.pop();
//                 }
//                 else 
//                     return false;
//                 }
            
//             else 
//                 return false;
//         }
//         return charSet.empty();
    }
}