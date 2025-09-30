class Solution {
    public boolean canJump(int[] nums) {
    Boolean[] dp = new Boolean[nums.length];
    return jump(nums,0,dp);
    }
    private boolean jump(int[] nums, int idx,Boolean[] dp ){
        if(idx>=nums.length-1){
            return true;
        }
        if(dp[idx] != null){
            return dp[idx];
        }
        int maxjump = nums[idx];
        for(int i=1;i<=maxjump;i++){
            if(jump(nums,idx+i,dp)){
                return dp[idx]= true;
            }
        }
        return dp[idx]=false;
    }
}