class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        return solve(m,n,0,0);
    }
    public int solve(int m, int n, int row, int col){
        if(row>=m || col>=n) return 0;
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        if(row == m-1 && col == n-1){
            return 1;
        }
        int right = solve(m,n,row,col+1);
        int bottom = solve(m,n,row+1,col);
        return dp[row][col] = right+bottom;
    }
}