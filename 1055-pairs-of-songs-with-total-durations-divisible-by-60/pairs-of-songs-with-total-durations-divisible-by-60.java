class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] freq = new int[60];
        int count = 0;
        for(int item : time){
            int rem = item%60;
            int comp = (60-rem)%60;
            count += freq[comp];
            freq[rem]++;
        }
        return count;
    }
}