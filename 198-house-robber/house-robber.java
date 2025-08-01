class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp =new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
    public int solve(int[] nums, int m){
        if(m>=nums.length){
            return 0;
        }
         if(dp[m] != -1){
            return dp[m];
        }
        int rob = solve(nums,m+2)+nums[m];
        int dont = solve(nums,m+1);
        dp[m] = Math.max(rob, dont);
        return dp[m];
    }
}