class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ll = new ArrayList<>();
        int num=0;
        for(int n : nums){
            num = ((num<<1)+n)%5;
            ll.add(num==0);
        } 
        return ll;
    }
}