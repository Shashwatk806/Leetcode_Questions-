class Solution {
    public boolean isPal(String s, int i, int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i) == s.charAt(j)){
           return isPal(s,i+1,j-1);
        }
        return false;
    }
    public String longestPalindrome(String s) {
       int maxLength = Integer.MIN_VALUE;
       int idx = 0;
       for(int i= 0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            if(isPal(s,i,j) == true){
                if(j-i+1 > maxLength){
                    maxLength = j-i+1;
                    idx = i;
                }
            }
        }
       }
       return s.substring(idx,idx+maxLength);
    }
}