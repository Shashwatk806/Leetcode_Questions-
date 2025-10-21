class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch : order.toCharArray()){
            while(freq[ch-'a'] > 0){
                sb.append(ch);
                freq[ch-'a']--;
            }
        }
        for(char ch : s.toCharArray()){
            while(freq[ch-'a'] > 0){
                sb.append(ch);
                freq[ch-'a']--;
            }
        }
        return sb.toString();
    }
}