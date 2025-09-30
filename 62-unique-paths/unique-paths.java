class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
       for(int[] r: dp){
        Arrays.fill(r,-1);
       }
       return solve(0,m,0,n,dp);
    }
    public int solve(int i,int m,int j,int n,int[][] dp){
        if(i>=m || j>=n) return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i==m-1 && j==n-1) return 1;
        int down = solve(i+1,m,j,n,dp);
        int right = solve(i,m,j+1,n,dp);
        return dp[i][j] = down+right;
    }
}