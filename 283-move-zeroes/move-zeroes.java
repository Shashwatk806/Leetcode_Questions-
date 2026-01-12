class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        while(r<nums.length){
            if(nums[r]==0){
              r++;  
            }else{
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++; r++;
            }
        }
    }
}