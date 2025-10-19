class Solution {
    public int minDistance(String word1, String word2) {
        int length = (word1.length()-lcs(word1,word2))+(word2.length()-lcs(word1,word2));
        return length;
    }
      public static int lcs(String s1, String s2) {
			int[][] dp = new int[s1.length()+1][s2.length()+1];
		for(int i = 1;i<dp.length;i++) {
			for(int j = 1;j<dp[0].length;j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1+dp[i-1][j-1];
				}else {
					int a = dp[i-1][j];
					int b = dp[i][j-1];
					dp[i][j] = Math.max(a, b);
				}
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
}