class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        solve(k,n,1,new ArrayList<>(), res);
        return res;
    }
    public void solve(int k, int n, int idx, List<Integer> ll, List<List<Integer>> res){
        if(k==0 && n==0){
            res.add(new ArrayList<>(ll));
        }
        if(k==0 || n<0){
            return;
        }
        for(int i=idx; i<=9; i++){
            if(n-i<0) break;
            ll.add(i);
            solve(k-1,n-i,i+1,ll, res);
            ll.remove(ll.size()-1);
        }
    }
}