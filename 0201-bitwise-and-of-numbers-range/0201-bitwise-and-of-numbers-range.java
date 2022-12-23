class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        /* if there are common bits in between the two number for which we are taking bitwise AND , the common bits will be added to the solution.*/
        /*so we only need to find the common bits within the range*/
        int i=0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            i++;
        }
        return right<<i;
    }
}