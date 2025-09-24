class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates,0,target,new ArrayList<>(), ans);
        return ans;
    }
    public void solve(int[] arr, int idx, int target, List<Integer> ll, List<List<Integer>> ans){
        Arrays.sort(arr);
        if(target == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        if(target<0 || idx == arr.length){
            return;
        }
        for(int i = idx;i<arr.length;i++){
            if(i>idx && arr[i] == arr[i-1]) continue;;
           ll.add(arr[i]);
           solve(arr,i+1,target-arr[i],ll,ans);
           ll.remove(ll.size()-1);
        }
    }
}