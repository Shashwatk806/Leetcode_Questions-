class Solution {
    Boolean dp[][];
    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length()+1][p.length()+1];
        return solve(s,p,0,0);
    }
    public boolean solve(String s, String p, int i ,int j){
         if (dp[i][j] != null) {
            return dp[i][j];
        }
         if (i == s.length() && j == p.length()) {
            dp[i][j] = true;
            return dp[i][j];
        }

        if (j == p.length()) {
            return dp[i][j] = false;
        }
        if (i == s.length()) {
            for (int k = j; k < p.length(); k++) {
                if (p.charAt(k) != '*') return dp[i][j] = false;
            }
            return dp[i][j] = true;
        }
        if(p.charAt(j) =='?' ){
            return dp[i][j] = solve(s,p,i+1,j+1);
        }else if(p.charAt(j) == '*'){
            boolean take = solve(s,p,i,j+1);
            boolean dontTake = solve(s,p,i+1,j);
            return dp[i][j] = take || dontTake;
        }else if(s.charAt(i) == p.charAt(j)){
            return dp[i][j] = solve(s,p,i+1,j+1);
        }
        return dp[i][j] = false;
    }
}