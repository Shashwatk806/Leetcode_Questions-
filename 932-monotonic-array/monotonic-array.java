class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isInc = true;
        boolean isDec = true;
        for(int i = 1;i<nums.length;i++){
            if(!isInc && !isDec){
                return false;
            }
            if(nums[i-1] > nums[i] ){
                isInc = false;
            }else if(nums[i-1] < nums[i]){
                isDec = false;
            }
        }
        return isInc || isDec;
    }
}