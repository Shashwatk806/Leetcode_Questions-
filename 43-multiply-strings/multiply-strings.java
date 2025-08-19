class Solution {
    public String multiply(String num1, String num2) {
         if (num1.equals("0") || num2.equals("0")) return "0";
        int[] result = new int[num1.length() + num2.length()];
        for(int i = num2.length()-1;i>=0;i--){
            int digit2 = num2.charAt(i)-'0';
            for(int j =num1.length()-1;j>=0;j--){
                int digit1 = num1.charAt(j)-'0'; 
                  int mul = digit1 * digit2;
                int posLow = i + j + 1; 
                int posHigh = i + j;
                int sum = mul + result[posLow];
                result[posLow] = sum % 10;
                result[posHigh] += sum / 10;
            }
        }
          StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < result.length && result[i] == 0) i++;
        for (; i < result.length; i++) {
            sb.append(result[i]);
        }
        return sb.toString();
    }
}