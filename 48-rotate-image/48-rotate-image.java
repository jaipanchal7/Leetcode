class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp=0;
        int mid = n/2;
        
        //Transpose the matrix
        for(int row=0; row<n; row++){
            for(int col=0; col<n && row!=col; col++){
                temp = matrix[row][col];
                matrix[row][col]= matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        
        //reverse the elements of the matrix 
        for(int i=0; i<n; i++){
            int start = 0;
            int end = n-1;
            while(start<=end){
                temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}