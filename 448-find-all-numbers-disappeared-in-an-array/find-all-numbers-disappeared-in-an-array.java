class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        boolean[] dummy = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            dummy[nums[i]-1] = true;
        }
        for(int i=0;i<dummy.length;i++){
            if(!dummy[i]){
                ll.add(i+1);
            }
        }
        return ll;
    }
}