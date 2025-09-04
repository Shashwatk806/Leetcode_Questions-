class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2){
            return false;
        }
       int i=0;
       while(i+1<arr.length && arr[i+1]>arr[i]){
        i++;
       }
       int j = arr.length-1;
       while(j-1>=0 && arr[j-1]>arr[j]){
        j--;
       }
        if(i==0||j==arr.length-1){
        return false;
       }
       return i==j;
    }
}