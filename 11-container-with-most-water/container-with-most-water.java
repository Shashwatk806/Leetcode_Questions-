class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int n = height.length;
        int i = 0;
        int j=n-1;
        while(i<j){
            int length = Math.min(height[i], height[j]);
            int width = j-i;
            maxArea = Math.max(maxArea,length*width);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}