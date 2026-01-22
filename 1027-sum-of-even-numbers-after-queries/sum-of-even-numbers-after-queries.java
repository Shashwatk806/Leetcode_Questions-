class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] evenSumArr = new int[queries.length];
        // Arrays.sort(queries,(a,b) -> a[1]-b[1]);
        for(int i=0;i<queries.length; i++){
            int val = queries[i][0];
            int q = queries[i][1];
            nums[q] = nums[q]+val;
            int sum = 0;
            for(int j=0;j<n;j++){
                if(nums[j]%2==0){
                    sum += nums[j];
                }
            }
            evenSumArr[i] = sum;
        }
        return evenSumArr;
    }
}