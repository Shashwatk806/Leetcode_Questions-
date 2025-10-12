class Solution {
    public int repeatedStringMatch(String a, String b) {
        int rep = 0;
        StringBuilder str = new StringBuilder();
        while(str.length() < b.length()){
            str.append(a);
            rep++;
        }
        if(str.indexOf(b) != -1){
            return rep;
        }
        str.append(a);
       if(str.indexOf(b) != -1) {
			 return rep+1;
		 }
		return -1;
    }
}