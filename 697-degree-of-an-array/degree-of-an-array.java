class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i])[1] = i;
            }else{
                map.put(nums[i], new int[]{i,i});
            }
        }
        int degree = 0;
        for(int c : freq.values()){
            degree= Math.max(c, degree);
        }
        int minLength = nums.length;
        for(int key : freq.keySet()){
            if(freq.get(key)==degree){
                int[] occ = map.get(key);
                int length = occ[1]-occ[0]+1;
                minLength = Math.min(length,minLength);
            }
            
        }
        return minLength;
    }
}