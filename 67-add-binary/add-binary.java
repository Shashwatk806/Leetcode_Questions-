class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry>0){
            int num1 = 0;
            int num2 = 0;
            if(i>=0){
                num1 = a.charAt(i--)-'0';
            }
            if(j>=0){
                num2 = b.charAt(j--)-'0';
            }
           int sum = num1+num2+carry;
            carry = sum/2;
             sum = sum%2;
            sb.append(sum);
        }
        return sb.reverse().toString();
    }
}