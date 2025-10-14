class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       HashSet<String> set = new HashSet<>(Arrays.asList(banned));
       HashMap<String,Integer> map = new HashMap<>();
       int count = Integer.MIN_VALUE;
       String ans = "";
       String[] words = paragraph.toLowerCase().split("[!?',;.\\s]+"); 
       for(String word : words){
        if(!set.contains(word)){
            map.put(word,map.getOrDefault(word,0)+1);
            if(map.get(word) > count){
                count = map.get(word);
                ans = word;
            }
        }
       }
       return ans;
    }
}