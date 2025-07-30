class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()+1][word2.length()+1];
        for(int[] r: dp){
            Arrays.fill(r,-1);
        }
        return solve(word1,word2,0,0);
    }
    public int solve(String a, String b, int m, int n){
        if(m == a.length()) return b.length()-n ;
        if(n == b.length()) return a.length()-m;
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        if(a.charAt(m) == b.charAt(n)){
            int ahead = solve(a,b,m+1,n+1);
            dp[m][n] = ahead;
        }else{
            int remove = solve(a,b,m+1,n);
            int replace = solve(a,b,m+1,n+1);
            int insert = solve(a,b,m,n+1);
            dp[m][n] = 1+Math.min(remove,Math.min(replace,insert));
        }
        return dp[m][n];
    }
}