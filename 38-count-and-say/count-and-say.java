class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String st = "1";
        for(int i=2;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j =1;j<st.length();j++){
                if(st.charAt(j) == st.charAt(j-1)){
                    count++;
                }else{
                    sb.append(count).append(st.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(count).append(st.charAt(st.length()-1));
            st = sb.toString();
        }
        return st;
    }
}