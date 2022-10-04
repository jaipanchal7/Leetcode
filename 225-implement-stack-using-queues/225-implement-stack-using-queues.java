class MyStack {
    
    Queue<Integer> q;
    int size;

    public MyStack() {
        q = new LinkedList();
    }
    
    public void push(int x) {
        q.add(x);
        size++;
    }
    
    public int pop() {
        int tempSize = 1;
        while(tempSize < size){
            q.add(q.remove());
            tempSize++;
        }
        size--;
        return q.remove();
    }
    
    public int top() {
        int tempSize = 1;
        int top = -1;
        while(tempSize <= size){
            top = q.remove();
            q.add(top);
            tempSize++;
        }
        return top;
    }
    
    public boolean empty() {
        return size == 0;
    }
    
    

//     Stack<Integer> stk = new Stack<>();

//     public MyStack() {
        
//     }
    
//     public void push(int x) {
//         stk.push(x);
//     }
    
//     public int pop() {
//         return stk.pop();
//     }
    
//     public int top() {
//         return stk.peek();
//     }
    
//     public boolean empty() {
//         return stk.isEmpty();
//     }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */