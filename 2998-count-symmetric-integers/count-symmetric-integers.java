class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int num= low;num<=high;num++){
            String str = Integer.toString(num);
             if (str.length() % 2 != 0) continue;
            int sumLeft =0;
            int sumRight = 0;
            int l = 0; int r = str.length()-1; 
            while(l < r){
                sumLeft += str.charAt(l)-'0';
                sumRight += str.charAt(r)-'0';
                l++; r--;
            }
            if(sumLeft == sumRight){
                count++;
            }
        }
        return count;
    }
}