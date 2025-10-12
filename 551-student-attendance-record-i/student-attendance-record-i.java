class Solution {
    public boolean checkRecord(String s) {
        char[] ch = s.toCharArray();
        int Acount = 0;
        int Lcount = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] == 'P'){
                Lcount=0;
                continue;
            }else if(ch[i]=='A'){
                Lcount=0;
                Acount++;
                if(Acount>=2) return false;
            }else{
                Lcount++;
                if(Lcount>=3) return false;
            }
        }
        return true;
    }
}