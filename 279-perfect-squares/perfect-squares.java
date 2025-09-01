class Solution {
    int[] dp;
    public int numSquares(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }
    public int solve(int val){
        if(val==0){
            return 0;
        }
        if(dp[val] != -1){
            return dp[val];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1;i*i<= val;i++){
            min = Math.min(min,solve(val-i*i)+1);
        }
        dp[val] = min;
        return dp[val];
    }
}