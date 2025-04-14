class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count =  0;
        for(int i = 0;i<arr.length-2;i++){
            for(int j = i+1;j<arr.length-1;j++){
                 int x = Math.abs(arr[i]-arr[j]);
                 if(x > a) continue;
                for(int k = j+1;k<arr.length;k++){
                    int y = Math.abs(arr[j]-arr[k]);
                    if(y > b) continue;
                    int z = Math.abs(arr[i]-arr[k]);
                    if(z>c) continue;
                    count++;
                }
            }
        }
        return count;
    }
}