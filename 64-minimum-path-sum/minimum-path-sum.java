class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        return solve(grid,0,0,dp);
    }
    private int solve(int[][] arr, int m, int n,int[][] dp){
        if(m==arr.length-1 && n==arr[0].length-1){
            dp[m][n] = arr[m][n];
            return dp[m][n];
        }
         if(m>=arr.length || n>= arr[0].length){
            return Integer.MAX_VALUE;
        }
         if(dp[m][n] != -1){
            return dp[m][n];
        }
        int down =solve(arr,m+1,n,dp);
        int right = solve(arr,m,n+1,dp);
        dp[m][n] = Math.min(down,right) + arr[m][n];
        return dp[m][n];
    }
}