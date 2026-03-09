class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        solve(candidates,0,target,new ArrayList<>(),res);
        return res;
    }
    public void solve(int[] arr, int idx, int target, List<Integer> ll, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(ll));
            return;
        }
        if(idx==arr.length || target<0) return;

        ll.add(arr[idx]);
        solve(arr, idx+1, target-arr[idx], ll, res);
        ll.remove(ll.size()-1);
        while(idx+1<arr.length && arr[idx]==arr[idx+1]){
            idx++;
        }
        solve(arr,idx+1,target,ll,res);
    }
}