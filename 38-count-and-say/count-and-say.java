class Solution {
    public String countAndSay(int n) {
        //      if(n==1) {
	    // 	 return "1";
	    //  }
		 String s = "1";
		 for(int i = 2;i<=n;i++) {
			 s = nextelement(s);
		 }
		 return s;
	    }
	private static String nextelement(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i = 1;i<s.length();i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				count++;
			}else {
				sb.append(count).append(s.charAt(i-1));
				count = 1;
			}
		}
		sb.append(count).append(s.charAt(s.length()-1));
		return sb.toString();
    }
}