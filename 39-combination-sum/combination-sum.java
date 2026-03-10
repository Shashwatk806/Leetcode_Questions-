class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,0,target,new ArrayList<>(), res);
        return res;
    }
    private void solve(int[] arr, int idx, int target, List<Integer> ll, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(ll));
            return;
        }
        if(target<0) return;
       for(int i=idx;i<arr.length;i++){
        if(arr[i]>target) break;
        ll.add(arr[i]);
        solve(arr,i,target-arr[i],ll,res);
        ll.remove(ll.size()-1);
       }
    }
}