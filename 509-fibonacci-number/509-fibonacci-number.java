class Solution {
    public int fib(int n) {
        // Using recursion
        if(n<=1){
            return n;
        }
        
        return fib(n-1) + fib(n-2);
        
        
//         // TC = O(n) & SC = O(1) since we are only updating values of variable a,b,c.
//         if(n == 0 || n == 1) 
//             return n;
        
//         int a = 0, b = 1, c = a+b;
//         for(int i = 3; i <= n; i++){
//             a = b;
//             b = c;
//             c = a + b;
//         }
//         return c;
    }
}