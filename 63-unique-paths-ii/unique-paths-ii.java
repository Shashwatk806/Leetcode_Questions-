class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        return solve(obstacleGrid,0,0,m,n,dp);
    }
    private int solve(int[][] arr, int r, int c,int m, int n, int[][] dp){
        if(r>=m || c>=n) return 0;
        if(arr[r][c] == 1) return 0;
        if(dp[r][c] != -1) return dp[r][c];
        if(r==m-1 && c==n-1) return 1;

        int down = solve(arr,r+1,c,m,n,dp);
        int right = solve(arr,r,c+1,m,n,dp);
        return dp[r][c]= down+right;
    }
}