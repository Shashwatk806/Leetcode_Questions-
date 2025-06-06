class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
		Paranthesis(n,0,0,"",ll);
        return ll;
        
    }
    public static void Paranthesis(int n, int open, int close, String ans,List<String> ll) {
		if(open == n && close == n) {
			ll.add(ans);
			// System.out.println(ans);
			return;
		}
		if(open>n || close> open) {
			return;
		}
		//if(open<n)
		Paranthesis(n, open+1, close, ans+"(", ll);
		// if(close<open)
		Paranthesis(n, open, close+1, ans+")", ll);
        
	}
}