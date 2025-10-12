class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                if(isValid(s,left+1,right)) return true;
                if(isValid(s,left,right-1)) return true;
                return false;
            }
        }
        return true;
    }
    public boolean isValid(String s, int i, int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}