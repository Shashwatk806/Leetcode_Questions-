class Solution {
    public int addDigits(int num) {
       
        return solve(num);
    }
    public int solve(int num){
         if(num <= 9){
            return num;
        }
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        num = sum;
        return solve(num);
    }
}