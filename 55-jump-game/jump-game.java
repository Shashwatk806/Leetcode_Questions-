class Solution {
    Boolean[] dp;
    public boolean canJump(int[] nums) {
        dp = new Boolean[nums.length];
        return solve(nums,0);
    }
    public boolean solve(int[] nums, int idx){
       if(idx==nums.length-1){
        return true;
       }
       if(idx>=nums.length || nums[idx] == 0){
        return false;
       }
       if(dp[idx] != null){
        return dp[idx];
       }
       int maxJump = nums[idx];
       for(int i = 1; i<=maxJump; i++){
        if(solve(nums, idx+i)){
            return dp[i] = true;
        }
       }
       return dp[idx] = false;
    }
}