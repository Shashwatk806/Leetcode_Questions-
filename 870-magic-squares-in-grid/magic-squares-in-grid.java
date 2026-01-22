class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[0].length-2;j++){
                if(isMagicSquare(grid,i,j))count++;
            }
        }
        return count;
    }
    public boolean isMagicSquare(int[][] arr,int row, int col){
        int sum = arr[row][col]+arr[row][col+1]+arr[row][col+2];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int val = arr[row+i][col+j];
                if(val<1 || val>9 || set.contains(val)) return false;
                set.add(val);
            }
        }
        for(int i=0;i<3;i++){
            if(arr[row][col+i]+arr[row+1][col+i]+arr[row+2][col+i] != sum) return false;
            if(arr[row+i][col]+arr[row+i][col+1]+arr[row+i][col+2] != sum)return false;
        }
        if(arr[row][col]+arr[row+1][col+1]+arr[row+2][col+2] != sum)return false;
        if(arr[row][col+2]+arr[row+1][col+1]+arr[row+2][col] != sum)return false;
        return true;
    }
}