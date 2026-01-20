class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j = nums.length-1;
        int[] temp = new int[nums.length];
        int idx = temp.length-1;
        while(i<=j){
            int sq1 = nums[i]*nums[i];
            int sq2 = nums[j]*nums[j];
           if(sq1 > sq2){
            temp[idx] = sq1;
            i++;
           }else{
            temp[idx] = sq2;
            j--;
           }
           idx--;
        }
        return temp;
    }
}