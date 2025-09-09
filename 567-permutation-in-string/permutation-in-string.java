class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return solve(s1,s2);
    }
    public boolean solve(String s1,String s2){
        int[] s1count = new int[26];
        int[] s2count = new int[26];
        int n = s1.length();
        for(int i=0;i<n;i++){
            s1count[s1.charAt(i)-'a']++;
        }
        int i=0;
        int j = 0;
        while(j<s2.length()){
            s2count[s2.charAt(j)-'a']++;
            if(j-i+1>n){
                s2count[s2.charAt(i)-'a']--;
                i++;
            }
            if(matches(s1count,s2count)) return true;
            j++;
        }
        return false;
    }
     private boolean matches(int[] a,int[] b) {
        for (int i=0;i<26;i++) {
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}