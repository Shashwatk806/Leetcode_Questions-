class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] r : dp){
            Arrays.fill(r, -1);
        }
        int a = solve(word1,word2,0,0,dp);
        int length = (m-a)+(n-a);
        return length;
    }
    public int solve(String s1, String s2, int i , int j, int[][] dp){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = 1+solve(s1,s2,i+1,j+1,dp);
        }else{
            return dp[i][j] = Math.max(solve(s1,s2,i+1,j,dp), solve(s1,s2,i,j+1,dp));
        }
    }
}