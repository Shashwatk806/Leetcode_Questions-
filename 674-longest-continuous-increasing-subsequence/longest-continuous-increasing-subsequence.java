class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int length = 1;
        int maxLength = 1;
        for(int i= 1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                length++;
            }else{
                maxLength = Math.max(length,maxLength);
                length=1;
            }
        }
          maxLength = Math.max(length,maxLength);
           return maxLength;
    }
   
}