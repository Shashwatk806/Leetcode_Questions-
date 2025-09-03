class Solution {
    public int[] sortedSquares(int[] nums) {
       int left = 0;
       int right = nums.length-1;
       int[] ans = new int[nums.length];
       int idx = ans.length-1;
       while(left<=right){
        int leftsq = nums[left]*nums[left];
        int rightsq = nums[right]*nums[right];
        if(leftsq>rightsq){
            ans[idx] = leftsq;
            left++;
        }else{
            ans[idx] = rightsq;
            right--;
        }
        idx--;
       }
       return ans;
    }
}