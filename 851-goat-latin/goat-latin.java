class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String last = "a";
        String[] words = sentence.split(" ");
        for(String word : words){
            if(isVowel(word.charAt(0))){
                sb.append(word);
            }else{
                sb.append(word.substring(1)).append(word.charAt(0));
            }
            sb.append("ma").append(last).append(" ");
            last += "a";
        }
        return sb.toString().trim();
    }
    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
}