class Solution {
    Boolean[][] dp;
    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length()+1][p.length()+1];
        return solve(s,p,0,0);
    }
    public boolean solve(String s, String p,int i, int j){
         if (i > s.length() || j > p.length()) {
            return false;
        }
        if(dp[i][j] != null){
             return dp[i][j];
        }
        if(i>=s.length() && j>=p.length()){
            return dp[i][j]= true;
        }
        if(j >= p.length()){
            return dp[i][j] = false;
        }
        boolean match = (i<s.length() && s.charAt(i) == p.charAt(j))
                        || (p.charAt(j) == '.');

        if(j+1 < p.length() && p.charAt(j+1) == '*'){
          return dp[i][j]= solve(s,p,i,j+2) || (match && solve(s,p,i+1,j));
        }else{
          return dp[i][j]= match && solve(s,p,i+1,j+1);
        }
    }
}