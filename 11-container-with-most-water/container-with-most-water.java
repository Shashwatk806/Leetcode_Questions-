class Solution {
    public int maxArea(int[] height) {
        return solve(height);
    }
    private int solve(int[] arr){
        int i=0;
        int j = arr.length-1;
        int maxArea = 0;
        while(i<j){
            int breadth = Math.min(arr[i], arr[j]);
            int length = j-i;
            int area = breadth*length;
            maxArea = Math.max(maxArea,area);
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}