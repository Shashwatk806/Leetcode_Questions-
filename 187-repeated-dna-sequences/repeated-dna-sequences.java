class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String str = s.substring(i,i+10);
            if(set.contains(str)){
                repeated.add(str);
            }else{
                set.add(str);
            }
        }
        return new ArrayList<>(repeated);
    }
}