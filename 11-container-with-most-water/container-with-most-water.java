class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int i = 0; int j = n-1;
        while(i<j){
            int length = Math.abs(j-i);
            int width = Math.min(height[i], height[j]);
            int area = length*width;
            max = Math.max(max, area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}