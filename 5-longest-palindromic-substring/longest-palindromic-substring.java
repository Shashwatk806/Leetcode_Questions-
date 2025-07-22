class Solution {
     int[][] dp;
    public boolean isPal(String s, int i, int j){
       
        if(i>=j){
            return true;
        }
        if(dp[i][j] != -1){
            return dp[i][j] == 1;
        }
        if(s.charAt(i) == s.charAt(j)){
        dp[i][j] = isPal(s,i+1,j-1) ? 1 : 0;
        return dp[i][j] == 1;
        }
        dp[i][j] = 0;
        return false;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
         dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
       int maxLength = Integer.MIN_VALUE;
       int idx = 0;
       for(int i= 0;i<n;i++){
        for(int j=i;j<n;j++){
            if(isPal(s,i,j) == true){
                if(j-i+1 > maxLength){
                    maxLength = j-i+1;
                    idx = i;
                }
            }
        }
       }
       return s.substring(idx,idx+maxLength);
    }
}