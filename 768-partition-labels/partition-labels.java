class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> ll = new ArrayList<>();
       int[] lastOcc = new int[26];
       for(int i=0;i<s.length();i++){
        lastOcc[s.charAt(i)-'a'] = i;
       }
       int left = 0; int right=0;
       for(int i=0;i<s.length();i++){
        right = Math.max(right,lastOcc[s.charAt(i)-'a']);
        if(i==right){
            ll.add(right-left+1);
            left=right+1;
        }
       }
       return ll;
    }
}