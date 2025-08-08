class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                char prev = st.peek();
                if(isPair(prev,ch)){
                    st.pop();
                    continue;
                }
            }
           st.push(ch);
        }
        return st.isEmpty();
    }
      private boolean isPair(char prev, char curr) {
        return (prev == '(' && curr == ')') ||
               (prev == '{' && curr == '}') ||
               (prev == '[' && curr == ']');
    }    
}