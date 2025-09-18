class Solution {
    public int threeSumMulti(int[] arr, int target) {
        return solve(arr,target);
    }
    private int solve(int[] arr, int target){
        int n = arr.length;
          int mod = 1000000007;
        Arrays.sort(arr);
        long count = 0;
        for(int i=0;i<n-2;i++){
            int j= i+1;
            int k = n-1;
           while(j<k){
              int sum = arr[i]+arr[j]+arr[k];
             if (sum == target) {
                    if (arr[j] == arr[k]) {
                        long m = k-j+1;
                        count += m*(m-1)/2;
                        count %= mod;
                        break;
                    } else {
                        int lCount = 1;
                        int rCount = 1;
                        while (j+1<k && arr[j] == arr[j+1]) {
                            lCount++;
                            j++;
                        }
                        while (k-1>j && arr[k] == arr[k-1]) {
                            rCount++;
                            k--;
                        }
                        count += (long) lCount*rCount;
                        count %= mod;
                        j++;
                        k--;
                    }
                    }else if(sum<target){
                j++;
              }else{
                k--;
              }
           }
        }
        int ans = (int) count % mod;
        return ans ;
    }
}