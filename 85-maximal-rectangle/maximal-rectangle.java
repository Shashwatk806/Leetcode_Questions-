class Solution {
    public int maximalRectangle(char[][] matrix) {
        return prefixSum(matrix);
    }

    public int prefixSum(char[][] matrix){
        int n = matrix.length; int m = matrix[0].length;
        int maxArea = 0;
        int[][] prefix = new int[n][m];
        for(int j = 0; j<m; j++){
            int sum = 0;
            for(int i = 0;i<n;i++){
              if(matrix[i][j] == '1'){
                 sum+=1;
                prefix[i][j] = sum;
              }else{
                sum = 0;
              }
            }
        }
        for(int i = 0;i<prefix.length;i++){
            int area = histogram(prefix[i]);
            maxArea = Math.max(area,maxArea);
        }
         return maxArea;
    }

    public int histogram(int[] arr){
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int el = arr[st.pop()];
                int nse = i;
                int pse = st.isEmpty()?-1:st.peek();
                int area = el*(nse-pse-1);
                max = Math.max(area,max);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int el = arr[st.pop()];
            int nse = arr.length;
            int pse = st.isEmpty()?-1:st.peek();
            int area = el*(nse-pse-1);
            max = Math.max(area,max);
        }
         return max;
    }
   
}