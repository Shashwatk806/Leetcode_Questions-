class Solution {
     HashMap<String,Boolean> map = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
       return solve(s1,s2);
    }
    public boolean solve(String s1, String s2){
       if(s1.equals(s2)){
        return true;
       }
       if(s1.length() != s2.length()){
        return false;
       }
        String key = s1+'_'+s2;
        if(map.containsKey(key)) return map.get(key);
           int n = s1.length();
        for(int i=1;i<s1.length();i++){
            boolean dontSwap = solve(s1.substring(0,i), s2.substring(0,i)) && 
                               solve(s1.substring(i,n), s2.substring(i,n));
            boolean swap =    solve(s1.substring(0,i), s2.substring(n-i,n)) && 
                           solve(s1.substring(i,n), s2.substring(0,n-i)) ;
                  if (dontSwap || swap) {
                map.put(key, true);
                return true;
            }
        }
        map.put(key,false);
        return map.get(key);
    }
}