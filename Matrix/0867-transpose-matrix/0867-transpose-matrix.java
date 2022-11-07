class Solution {
    public int[][] transpose(int[][] matrix) {
        
        
        // TC : 0(n*m) , SC : 0(n*m)        
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] arr = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
        
        
        // TC : 0(n*m) , SC : 0(1)        
        // int n = matrix.length;
        
//         for (int i=0; i<n; i++){
//             for (int j=i+1; j<n; j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
        
//         return matrix;
        
        
        
        
        // TC : 0(n*m) , SC : 0(n*m)
        
//         int n = matrix.length, m = matrix[0].length;
//         int[][] transposedMatrix = new int[m][n];
        
//         for (int i=0; i<m; i++)
//             for (int j=0; j<n; j++)
//                 transposedMatrix[i][j] = matrix[j][i];
        
//         return transposedMatrix;
    }
}