class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        for(int i=0;i<n;i++){
            int a=0;
            int b=m-1;
            while(a<b){
                int temp = image[i][a];
                image[i][a] = image[i][b];
                image[i][b] = temp;
                a++; b--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              image[i][j] = (image[i][j]==0) ? 1 : 0;
            }
        }
        return image;
    }
}