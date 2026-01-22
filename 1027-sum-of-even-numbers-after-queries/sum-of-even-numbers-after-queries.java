class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int evenSum = 0;
        for(int m : nums){
            if(m%2==0){
                evenSum+=m;
            }
        }
        int[] evenArr = new int[n];
        for(int i=0;i<n;i++){
            int val = queries[i][0];
            int idx = queries[i][1];
            if(nums[idx]%2==0){
                evenSum -= nums[idx];
            }
            nums[idx] += val;
            if(nums[idx]%2==0){
                evenSum+=nums[idx];
            }
            evenArr[i] = evenSum;
        }
        return evenArr;
    }
}