class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length; int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] r: dp){
            Arrays.fill(r,-1);
        }
        return solve(obstacleGrid,0,0,dp);
    }
    private int solve(int[][] arr, int m, int n, int[][] dp){
        if(m>=arr.length || n>=arr[0].length || arr[m][n] == 1) return 0;
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        if(m==arr.length-1 && n==arr[0].length-1) return 1;
        int down = solve(arr,m+1,n,dp);
        int right = solve(arr,m,n+1,dp);
        return dp[m][n] = down+right;
    }
}