class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        boolean[] seen = new boolean[26];
        for(int i=0;i<s.length();i++){
            char item = s.charAt(i);
            freq[item-'a']--;
          if(seen[item-'a']) continue;
          while(!st.isEmpty() && st.peek()>item  && freq[st.peek()-'a']>0){
            seen[st.pop()-'a'] = false;
          }
            st.push(item);
            seen[item-'a']= true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}