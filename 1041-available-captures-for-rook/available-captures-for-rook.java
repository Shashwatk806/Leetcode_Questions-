class Solution {
    public int numRookCaptures(char[][] board) {
        int row = 0;
        int col = 0;
        int count = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    row = i;
                    col = j;
                    count = isValid(board,row,col);
                }
            }
        }
        return count;
    }
    private int isValid(char[][] board, int r, int c){
        int count = 0;
        for(int i=r-1;i>=0;i--){
            if(board[i][c]=='p'){
                count++;
                break;
            }
            if(board[i][c]=='B') break;
        }
        for(int i=r+1;i<board.length;i++){
              if(board[i][c]=='p'){
                count++;
                break;
            }
            if(board[i][c]=='B') break;
        }
        for(int j=c+1;j<board[0].length;j++){
              if(board[r][j]=='p'){
                count++;
                break;
            }
            if(board[r][j]=='B') break;
        }
        for(int j=c-1;j>=0;j--){
              if(board[r][j]=='p'){
                count++;
                break;
            }
            if(board[r][j]=='B') break;
        }
        return count;
    }
}