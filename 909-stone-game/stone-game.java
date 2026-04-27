class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer[][] dp = new Integer[n][n];

        return solve(0, n - 1, piles, dp) > 0;
    }

    private int solve(int i, int j, int[] piles, Integer[][] dp) {

        if (i == j) return piles[i];

        if (dp[i][j] != null) return dp[i][j];

        int pickLeft = piles[i] - solve(i + 1, j, piles, dp);
        int pickRight = piles[j] - solve(i, j - 1, piles, dp);

        return dp[i][j] = Math.max(pickLeft, pickRight);
    }
}