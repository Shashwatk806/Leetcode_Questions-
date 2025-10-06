class Solution {
    public boolean exist(char[][] board, String word) {
        char[] ch = word.toCharArray();
        boolean result = false;
         boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == ch[0]){
                   result = solve(board,i,j,ch,0,visited);
                   if(result){
                    return true;
                   } 
                }
            }
        }
        return false;
    }
    public boolean solve(char[][] board, int r, int c, char[] word,int idx, boolean[][] visited ){
        if(idx == word.length){
            return true;
        }
        if(r<0 || r>= board.length || c<0 || c>= board[0].length || board[r][c] !=  word[idx] || visited[r][c] ){
            return false;
        }
        visited[r][c] = true;
        boolean left = solve(board,r,c-1,word,idx+1,visited);
        boolean right = solve(board,r,c+1,word,idx+1,visited);
        boolean up = solve(board,r-1,c,word,idx+1,visited);
        boolean down = solve(board,r+1,c,word,idx+1,visited);
        boolean ans = (left || right || up || down) ;
        visited[r][c] = false;
        return ans;
    }
}