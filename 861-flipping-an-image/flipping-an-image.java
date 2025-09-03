class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for(int i=0;i<image.length;i++){
            int first = 0;
            int last = image[0].length-1;
            while(first<last){
                int temp = image[i][last];
                image[i][last] =image[i][first];
                image[i][first] = temp;
                first++;
                last--;
            }
        }
        int[][] ans = new int[image.length][image[0].length];
      
        for(int i =0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
               ans[i][j] = (image[i][j]==0) ? 1 : 0;
            }
        }
        return ans;
    }
}