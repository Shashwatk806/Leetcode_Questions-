class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        int aCount = 1;
        String[] words = sentence.split(" ");
        for(String word : words){
            if(isVowel(word.charAt(0))){
                sb.append(word);
            }else{
                sb.append(word.substring(1)).append(word.charAt(0));
            }
            sb.append("ma");
            for(int i=0;i<aCount;i++) sb.append('a');
            aCount++;
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
}