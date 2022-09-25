class Solution {
    public String reverseWords(String s) {
                
        StringBuilder sb = new StringBuilder();
        String trimmed = s.trim();
        String[] arr = trimmed.split(" ");
        
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }
        while(stack.size()!=0){
            sb.append(stack.pop()+ " ");
        }
        
        // if we want use trim() in return then we've to use this....
        // while(stack.size()!=0){       // we can use while(!str.isEmpty())
        //     if(stack.size()==1){
        //         sb.append(stack.pop());
        //     }else{
        //     sb.append(stack.pop()+ " ");
        //     }
        // }
        
        // System.out.println(sb);
        // System.out.println(Arrays.toString(arr));
        // return list.toString();
        // return sb.toString();
        return sb.toString().replaceAll("\\s+"," ").trim();
        // .toString() -> to convert StringBuilder to String
        // .replaceAll("\\s+", " ") -> remove all spaces between string except " "
        // .trim() -> (remove last space while return)remove all spaces from starting index and last index of string
    }
}
