class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean rowImpact = false;
        boolean colImpact = false;
        for(int c=0; c<m; c++){
            if(matrix[0][c] == 0){
                rowImpact =true;
                break;
            }
        }
        for(int r= 0;r<n; r++){
            if(matrix[r][0] == 0){
                colImpact = true;
                break;
            }
        }
        for(int r=1;r<n; r++){
            for(int c = 1; c<m; c++){
                if(matrix[r][c] == 0){
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                }
            }
        }
        for(int r=1; r<n; r++){
            for(int c= 1; c<m; c++){
                if(matrix[0][c] == 0 || matrix[r][0]==0){
                    matrix[r][c] =0;
                }
            }
        }
        if(rowImpact){
            for(int c=0;c<m;c++){
                matrix[0][c]=0;
            }
        }
        if(colImpact){
            for(int r=0;r<n;r++){
                matrix[r][0]=0;
            }
        }
    }
}