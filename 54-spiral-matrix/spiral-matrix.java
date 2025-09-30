class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
       int count=0;
         int minr = 0; int minc= 0;
         int maxr = matrix.length-1; int maxc = matrix[0].length-1;
        while(minr<=maxr && minc<=maxc){
           
            for(int i=minc;i<=maxc && count< n*m;i++){
                ll.add(matrix[minr][i]);
               count++;
            }
            minr++;
            for(int i=minr;i<=maxr && count< n*m;i++){
                ll.add(matrix[i][maxc]);
               count++;
            }
            maxc--;
            for(int i=maxc;i>=minc && count< n*m;i--){
                ll.add(matrix[maxr][i]);
               count++;
            }
            maxr--;
            for(int i=maxr;i>=minr && count< n*m;i--){
                ll.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }
        return ll;
    }
}