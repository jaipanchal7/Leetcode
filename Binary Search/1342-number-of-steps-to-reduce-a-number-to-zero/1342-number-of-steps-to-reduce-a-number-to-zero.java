class Solution {
    // Recursive
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public int helper(int num, int steps){
        if(num == 0) 
            return steps;

        if(num % 2 == 0){
            return helper(num/2, steps + 1);
        }
        
        return helper(num - 1, steps + 1);
    }
    
    // Iterative
    // public int numberOfSteps(int num) {
    //     int count = 0;
    //     while (num > 0) {
    //         num = num % 2 == 0 ? num / 2 : num - 1;
    //         count++;
    //     }
    //     return count;
    // }
}