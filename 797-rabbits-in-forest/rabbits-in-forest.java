class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int totalNum = 0;
        for(int ans:answers){
            map.put(ans,map.getOrDefault(ans,0)+1);
        }
        for(Map.Entry<Integer,Integer> num : map.entrySet()){
            int x = num.getKey();
            int count = num.getValue();
            int groupSize = x+1;
            int groups = (int) Math.ceil((double) count / groupSize);
            totalNum += groups*groupSize;
        }
        return totalNum;
    }
}