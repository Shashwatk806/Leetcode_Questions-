class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for(int i = 0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int num = heights[st.pop()];
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
               int area = num*(nse-pse-1);
                maxArea = Math.max(area,maxArea);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
             int num = heights[st.pop()];
                int nse = heights.length;
                int pse = st.isEmpty() ? -1 : st.peek();
               int area = num*(nse-pse-1);
                maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}