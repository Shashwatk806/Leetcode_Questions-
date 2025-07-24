class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int maxLength = 0;
        st.push(-1);
        for(int i = 0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch == ')'){
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    int length = i-st.peek();
                maxLength = Math.max(length,maxLength);
                }
            }else{
                st.push(i);
            }
        }
        return maxLength;
    }
}