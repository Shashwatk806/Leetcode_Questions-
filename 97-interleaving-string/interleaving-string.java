class Solution {
    Boolean[][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n =s2.length();
        int k =s3.length();
        if(m+n!=k) return false;
        dp = new Boolean[m+1][n+1];
        return solve(s1,0,s2,0,s3);
    }
    public boolean solve(String s1,int i,String s2,int j,String s3){
        if(i==s1.length() && j==s2.length() && i+j==s3.length()){
            return true;
        }
        if(i+j>=s3.length()){
            return false;
        }
          if (dp[i][j] != null) return dp[i][j];
        boolean ans = false;
         if (i < s1.length() && s1.charAt(i) == s3.charAt(i+j)) {
        ans = ans || solve(s1, i+1, s2, j, s3);
        }
        if (j < s2.length() && s2.charAt(j) == s3.charAt(i+j)) {
        ans = ans || solve(s1, i, s2, j+1, s3);
}
        return dp[i][j] = ans;
    }
}