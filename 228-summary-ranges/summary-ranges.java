class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ll = new ArrayList<>();
            if (nums.length == 0) return ll;
        int curr=0;
        int prev = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                curr++;
            }else{
                StringBuilder sb  = new StringBuilder();
                if(nums[curr] != nums[prev]){
                    sb.append(nums[prev]).append("->").append(nums[curr]);
                }else{
                    sb.append(nums[curr]);
                }
                ll.add(sb.toString());
                curr = i+1;
                prev = i+1;
            }
        }
         StringBuilder sb  = new StringBuilder();
                if(nums[curr] != nums[prev]){
                    sb.append(nums[prev]).append("->").append(nums[curr]);
                }else{
                    sb.append(nums[curr]);
                }
                ll.add(sb.toString());
        return ll;
    }
}