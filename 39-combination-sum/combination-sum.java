class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        solve(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
     public void solve(int[] arr,int idx, int target,List<Integer> ll, List<List<Integer>>ans){
        if(target == 0){
           ans.add(new ArrayList<>(ll)); 
           return;
        }
      if(target<0 || idx==arr.length){
        return;
      }
      ll.add(arr[idx]);
      solve(arr,idx,target-arr[idx],ll,ans);
      ll.remove(ll.size()-1);
      solve(arr,idx+1,target,ll,ans);
        
    }
    
}