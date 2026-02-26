class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = first(nums,target);
        ans[1] = last(nums,target);
        return ans;
    }
    private int first(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int idx = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                idx = mid;
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return idx;
    }
      private int last(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int idx = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                idx = mid;
                l=mid+1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return idx;
    }
}