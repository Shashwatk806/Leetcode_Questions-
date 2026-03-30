class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        return solve(grid,0,0,dp);
        
    }
    private int solve(int[][] arr, int i, int j, int[][] dp){
        if(i==arr.length-1 && j==arr[0].length-1){
            dp[i][j] = arr[i][j];
            return dp[i][j];
        }
        if(i>=arr.length || j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down = solve(arr,i+1,j,dp);
        int right = solve(arr,i,j+1,dp);
         dp[i][j] = arr[i][j]+Math.min(down,right);
         return dp[i][j];
    }
}