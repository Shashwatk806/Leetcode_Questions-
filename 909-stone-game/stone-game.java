class Solution {
    public boolean stoneGame(int[] piles) {
        return solve(piles);
    }
    private static boolean solve(int[] piles){
        int n = piles.length;
        int alice =0;
        int bob = 0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                alice+=Math.max(piles[i],piles[n-i-1]);
            }else{
                bob+=Math.max(piles[i],piles[n-i-1]);
            }
        }
        return alice>=bob;
    }
}