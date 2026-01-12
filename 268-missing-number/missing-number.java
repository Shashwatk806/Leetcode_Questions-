class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        int idxSum = 0;
        for(int i=1;i<=nums.length;i++){
            idxSum += i;
        }
        return idxSum-totalSum;
    }
}