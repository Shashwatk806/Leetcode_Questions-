class Solution {
    public boolean isPalindrome(int x) {
        String s =Integer.toString(x);
       if(isPal(s)){
        return true;
       }
        return false;
    }
    public static boolean isPal(String s){
         int i = 0; int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) !=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}