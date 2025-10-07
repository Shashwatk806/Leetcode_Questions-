class Solution {
    public int maxProduct(int[] nums) {
        int maxp = nums[0];
        int minp = nums[0];
        int res = nums[0];
        for(int i =1;i<nums.length;i++){
            int item = nums[i];
            if(item<0){
                int temp = maxp;
                maxp=minp;
                minp=temp;
            }
            maxp = Math.max(item,maxp*item);
            minp = Math.min(item,minp*item);
            res = Math.max(maxp,res);
        }
        return res;
    }
}