class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ll = new ArrayList<>();
        int i = num.length-1;
        while(i>=0 || k>0){
            if(i>=0){
                k=k+num[i];
                i--;
            }
            ll.add(k%10);
            k=k/10;
        }
        Collections.reverse(ll);
        return ll;
    }
}