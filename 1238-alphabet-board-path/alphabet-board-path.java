class Solution {
    public String alphabetBoardPath(String target) {
        int x = 0; int y = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<target.length();i++) {
			char ch = target.charAt(i);
			int row = (ch-'a')/5;
			int col = (ch-'a')%5;
			while(x>row) {
				x--;
				sb.append('U');
			}
			while(col>y) {
				y++;
				sb.append('R');
			}
			while(y>col) {
				y--;
				sb.append('L');
			}
            while(row>x) {
				x++;
				sb.append('D');
			}
			sb.append('!');
		}
		return sb.toString();
    }
}