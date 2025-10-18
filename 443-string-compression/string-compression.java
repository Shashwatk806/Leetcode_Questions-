class Solution {
    public int compress(char[] chars) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(chars[i - 1]).append(count);
                } else {
                    sb.append(chars[i - 1]);
                }
                count = 1;
            }
        }
        if (count > 1) {
            sb.append(chars[chars.length - 1]).append(count);
        } else {
            sb.append(chars[chars.length - 1]);
        }
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }
}