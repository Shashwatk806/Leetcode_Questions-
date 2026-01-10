class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int n=0;n<numRows;n++){
            List<Integer> ll = new ArrayList<>();
               int val = 1;
            for(int i=0;i<=n;i++){
                ll.add(val);
                val = 	val = ((n-i)*val)/(i+1);
            }
            res.add(ll);
        }
        return res;
    }
}