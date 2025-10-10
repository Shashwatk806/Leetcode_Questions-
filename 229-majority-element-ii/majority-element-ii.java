class Solution {
    public List<Integer> majorityElement(int[] nums) {
       ArrayList<Integer> ll = new ArrayList<>();
       HashMap<Integer,Integer> map = new HashMap<>();
       int maxcount = nums.length/3;
       for(int num : nums){
        int count = map.getOrDefault(num,0)+1;
        map.put(num,count);
       }
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue() > maxcount){
            ll.add(entry.getKey());
        }
       }
       return ll;
    }
}