class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        int[] ans = new int[2];
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        ans = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=ans[1]){
                ans[1] = Math.max(intervals[i][1], ans[1]);
            }else{
                res.add(ans);
                ans=intervals[i];
            }
        }
        res.add(ans);
        return res.toArray(new int[res.size()][]);
    }
}