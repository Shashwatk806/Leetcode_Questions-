class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return solve(s1,s2);
    }
    public boolean solve(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<n;i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int i=0; int j = 0;
        while(j<m){
            freq2[s2.charAt(j)-'a']++;
            if(j-i+1>n){
                freq2[s2.charAt(i)-'a']--;
                i++;
            }
            if(matches(freq1,freq2)) return true;
            j++;
        }
        return false;
    }
    private boolean matches(int[] a, int[] b){
        for(int i=0;i<26;i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}