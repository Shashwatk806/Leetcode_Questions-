class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            avg = sum;
        }
          double maxAvg = avg/k;
        for(int i=k;i<nums.length;i++){
            sum += nums[i];
            sum -= nums[i-k];
            avg = sum;
             maxAvg = Math.max(avg/k, maxAvg);
        }
        return maxAvg;
    }
}