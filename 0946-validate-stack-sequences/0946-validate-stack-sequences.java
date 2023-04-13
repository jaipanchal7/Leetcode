class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> stack = new Stack<>();
        
        int x = 0;
        
        for(int i : pushed){
            stack.push(i);
            
            while(!stack.empty() && stack.peek() == popped[x]){
                stack.pop();
                x++;
            }
        }
        
        return stack.empty();
    }
}