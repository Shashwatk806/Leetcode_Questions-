class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        return solve(matrix,dp);
    }
    private int solve(int[][] arr, int[][] dp){
        int n = arr.length;
        for(int j=0;j<n;j++){
            dp[0][j] = arr[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int down = dp[i-1][j];
                int left_dia = (j>0) ? dp[i-1][j-1] : (int)1e9;
                int right_dia = (j<n-1) ? dp[i-1][j+1] : (int)1e9;
                dp[i][j] = arr[i][j]+Math.min(down,(Math.min(left_dia,right_dia)));
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            min=Math.min(min,dp[n-1][j]);
        }
        return min;
    }
}