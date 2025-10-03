class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int[] r: dp) Arrays.fill(r,Integer.MAX_VALUE);
        return solve(triangle,0,0,dp);
    }
    private int solve(List<List<Integer>> triangle, int i, int j, int[][] dp){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j];
        }
        int down = solve(triangle,i+1,j,dp);
        int diagonal = solve(triangle,i+1,j+1,dp);
        dp[i][j] = triangle.get(i).get(j)+Math.min(down,diagonal);
        return dp[i][j];
    }
}