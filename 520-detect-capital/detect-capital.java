class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isLower = false;
        boolean isUpper = false;
        for(int i = 0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                isLower = true;
            }
             if(i>0 && Character.isUpperCase(word.charAt(i))){
                isUpper = true;
            }
            if(isLower && isUpper) return false;
        }
        return true;
    }
}