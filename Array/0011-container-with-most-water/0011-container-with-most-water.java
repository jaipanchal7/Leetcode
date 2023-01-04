class Solution {
    public int maxArea(int[] height) {
        int ans = 0, waterAcc = 0;
        int n = height.length;
        int i=0, j = n-1;

        while(i<j){
            waterAcc = Math.min(height[i], height[j]) * (j-i);
            ans = Math.max(ans, waterAcc);
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}