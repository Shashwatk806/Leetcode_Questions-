class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        return solve(words1, words2);
    }
    public List<String> solve(String[] words, String[] s2){
        int[] maxFreq = new int[26];
        for(String s : s2){
            int[] freq = new int[26];
            for(char ch : s.toCharArray()){
                freq[ch-'a']++;
            }
            for(int i =0;i<maxFreq.length;i++){
                maxFreq[i] = Math.max(maxFreq[i],freq[i]); 
            }
        }
        List<String> ll = new ArrayList<>();
        for(String word : words){
            int[] freq = new int[26];
            for(char ch : word.toCharArray()){
               freq[ch-'a']++;
            }
            boolean isValid = true;
            for(int i=0;i<maxFreq.length;i++){
                if(freq[i] < maxFreq[i]){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                    ll.add(word);
                }
        }
        return ll;
    }
}