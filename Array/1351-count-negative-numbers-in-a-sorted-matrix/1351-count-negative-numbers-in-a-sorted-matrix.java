class Solution {
    public int countNegatives(int[][] grid) {
        // bruteforce
        int row = grid.length;
        int col = grid[0].length;
        int c = 0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]<0){
                    c++;
                }
            }
        }
        return c;
    }
}