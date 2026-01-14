class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col != r*c) return mat;
        
        int[][] res = new int[r][c];
        int nrow = 0;
        int ncol = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                res[nrow][ncol] = mat[i][j];
                ncol++;
                if(ncol==c){
                    nrow++;
                    ncol=0;
                }
            }
        }
        return res;
    }
}