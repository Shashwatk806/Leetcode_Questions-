class Solution {
    public int[][] imageSmoother(int[][] img) {
         int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];

        // Directions for 8 neighbors and the current cell
        int[] directions = {-1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;

                // Iterate through neighbors
                for (int di : directions) {
                    for (int dj : directions) {
                        int ni = i + di;
                        int nj = j + dj;

                        // Check bounds
                        if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                            sum += img[ni][nj];
                            count++;
                        }
                    }
                }

                // Store the truncated average
                result[i][j] = sum / count;
            }
        }

        return result;
    }
}