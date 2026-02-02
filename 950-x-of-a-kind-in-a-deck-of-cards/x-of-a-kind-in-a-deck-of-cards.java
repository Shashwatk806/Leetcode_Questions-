class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : deck){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int gcd = 0;
        for(int num : map.values()){
            gcd = gcd==0?num:gcd(gcd,num);
        }
        return gcd>=2;
    }
    private int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}