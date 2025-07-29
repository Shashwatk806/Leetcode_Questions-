class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         if (obstacleGrid[0][0] == 1 || obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1) {
            return 0;
        }
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
         return solve(obstacleGrid,0,0);
    }
    public int solve(int[][] arr, int m, int n){
        if(m == arr.length-1 && n == arr[0].length-1){
            return 1;
        }
        if(m>=arr.length || n>= arr[0].length){
            return 0;
        }
        if(arr[m][n] == 1){
            return 0;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        int right = solve(arr,m,n+1);
        int bottom =solve(arr,m+1,n);
        dp[m][n] = right + bottom;
        return dp[m][n];
    }
}