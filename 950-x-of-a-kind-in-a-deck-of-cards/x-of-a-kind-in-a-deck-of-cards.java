class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : deck){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int gcd = 0;
        for(int freq : map.values()){
            gcd = gcd==0?freq:gcd(gcd,freq);
        }
        return gcd >=2;
    }
    private int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}