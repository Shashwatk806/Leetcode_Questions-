class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i = 0;i<s.length()-1; i+=2*k){
            if(i+k-1 < ch.length-1){
                swap(ch,i,i+k-1);
            }else{
                swap(ch,i,ch.length-1);
            }
        }
        String ans = new String(ch);
        return ans;
    }
    public void swap(char[] ch, int i, int j){
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++; j--;
        }
    }
}