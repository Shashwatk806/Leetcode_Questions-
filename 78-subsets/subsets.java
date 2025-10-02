class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(nums,0,new ArrayList<>(), ans);
        return ans;
    }
    public void solve(int[] nums,int idx, List<Integer> ll,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ll));
        for(int i=idx;i<nums.length;i++){
            // if(i>idx && nums[i]==nums[i-1]) continue;
            ll.add(nums[i]);
            solve(nums,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}