class Solution {
    public String gcdOfStrings(String s1, String s2) {
        if((s1+s2).equals(s2+s1)) {
			int ans = gcd(s1.length(), s2.length());
			return s2.substring(0, ans);
		}else {
			return "";
		}
	}
	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		while(a % b != 0) {
			int rem = a%b;
			a=b;
			b=rem;
		}
		return b;
    }
}