class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){ //sort arr using cyclic sort considering we have elements from [1 to n]
            int correct=arr[i]-1;
            if(correct>=0&&correct<arr.length && arr[i]!=arr[correct]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else i++;
        }
        for(i=0;i<arr.length;i++){// now iterate in arr if element !=index+1 return index+1
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;//means all elements from 1 are present so we return element greater than array length
    }
}