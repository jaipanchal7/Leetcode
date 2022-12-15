class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        fill(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    public void fill(int[][] arr,int m,int n,int c,int oc){
        if(oc==c)
            return;
        if(m>=0 && m<arr.length && n>=0 && n<arr[0].length && arr[m][n]==oc){
            arr[m][n]=c;
            fill(arr,m-1,n,c,oc);
            fill(arr,m+1,n,c,oc);
            fill(arr,m,n-1,c,oc);
            fill(arr,m,n+1,c,oc);
        }
    }
} 