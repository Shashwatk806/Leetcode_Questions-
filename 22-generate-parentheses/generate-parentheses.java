class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        solve(n,0,0, "" , ans);
        return ans;
    }
    public void solve(int n, int open, int close, String s, ArrayList<String> ll){
        if(open == n && close == n){
            ll.add(s);
            return;
        }
        if(open>n || close>open){
            return;
        }
        solve(n,open+1,close,s+'(', ll);
        solve(n,open,close+1, s+')', ll);
        return;
    }
}