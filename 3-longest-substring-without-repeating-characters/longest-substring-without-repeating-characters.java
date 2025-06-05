class Solution {
    public int lengthOfLongestSubstring(String s) {
       StringBuilder sb = new StringBuilder();
       int maxlength = 0;
       for(char ch : s.toCharArray()){
            int index = sb.indexOf(String.valueOf(ch));
            if(index != -1){
                sb.delete(0,index+1);
            }
            sb.append(ch);
            maxlength = Math.max(sb.length(),maxlength);
       }
       return maxlength;
    }

}