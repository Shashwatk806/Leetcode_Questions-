class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int item = target-nums[i];
            if(map.containsKey(item)){
                return new int[]{map.get(item),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}