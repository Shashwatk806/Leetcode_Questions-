class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        for(int a: aliceSizes) sumA += a;
        int sumB = 0;
        for( int b : bobSizes) sumB+=b;
        int diff = (sumB-sumA)/2;
        HashSet<Integer> set = new HashSet<>();
        for(int n: bobSizes) set.add(n);
        
        for(int x:aliceSizes){
            int y = x+diff;
            if(set.contains(y)){
                return new int[]{x,y};
            }
        }
        return new int[0];
    }
}