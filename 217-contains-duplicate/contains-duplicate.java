class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int item = entry.getKey();
            int freq = entry.getValue();
            if(freq > 1){
                return true;
            }
        }
        return false;
    }
}