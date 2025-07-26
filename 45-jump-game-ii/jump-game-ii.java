class Solution {
    int[] dp;    
    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
    public int solve(int[] nums, int idx){
       
       if (idx >= nums.length - 1) {
        return 0;
    }

    if (dp[idx] != -1) {
        return dp[idx];
    }

    int minJumps = Integer.MAX_VALUE;
    int maxJump = nums[idx];

    for (int jump = 1; jump <= maxJump; jump++) {
        if (idx + jump < nums.length) {
            int nextJump = solve(nums, idx + jump);
            if (nextJump != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, 1 + nextJump);
            }
        }
    }

    return dp[idx] = minJumps;
    }
}