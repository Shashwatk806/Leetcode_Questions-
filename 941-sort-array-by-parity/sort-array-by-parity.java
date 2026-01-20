class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]%2==0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
            r++;
        }
        return nums;
    }
}