class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ll = new ArrayList<>();
        long val = 1;
        for(int n=0;n<=rowIndex;n++){
            ll.add((int)val);
            val = ((rowIndex-n)*val)/(n+1);
        }
        return ll;
    }
}