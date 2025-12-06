class Solution {
      private static final int MOD = 1_000_000_007;
    public int countPartitions(int[] nums, int k) {
          int n = nums.length;
        long[] dp = new long[n+1];
        long[] prefix = new long[n+1];
        dp[0] = 1;
        prefix[0] = 1;
        Deque<Integer> maxQ = new ArrayDeque<>();
        Deque<Integer> minQ = new ArrayDeque<>();
        int left = 0;
         for (int right = 0; right<n; right++) {
            while (!maxQ.isEmpty() && maxQ.peekLast()<nums[right]) {
                maxQ.pollLast();
            }
            maxQ.addLast(nums[right]);
            while (!minQ.isEmpty() && minQ.peekLast()>nums[right]) {
                minQ.pollLast();
            }
            minQ.addLast(nums[right]);

            while (!maxQ.isEmpty() && !minQ.isEmpty() &&
                   (long)maxQ.peekFirst() - (long)minQ.peekFirst() > k) {

                int leftVal = nums[left];
                if (maxQ.peekFirst() == leftVal) maxQ.pollFirst();
                if (minQ.peekFirst() == leftVal) minQ.pollFirst();
                left++;
            }
            long ways = prefix[right];
            if (left >0) {
                ways = (ways-prefix[left-1]+MOD)%MOD;
            }
            dp[right+1]=ways;
            prefix[right+1] = (prefix[right] + dp[right+1])%MOD;

        }
        return (int) (dp[n] % MOD);
    }
}