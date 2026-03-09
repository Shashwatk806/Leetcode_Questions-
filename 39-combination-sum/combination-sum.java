class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solve(candidates,0,target,new ArrayList<>(), res);
        return res;
    }
    private void solve(int[] arr, int idx, int target, List<Integer> ll, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(ll));
            return;
        }
        if(target<0 || idx==arr.length){
            return;
        }
        ll.add(arr[idx]);
        solve(arr,idx,target-arr[idx],ll,res);
        ll.remove(ll.size()-1);
        solve(arr,idx+1,target,ll,res);
    }
}