class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res =  new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i-1]==arr[i]) continue;
            int j=i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==0){
                    res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;k--;
                while (j<k && arr[j] == arr[j-1]) j++;
                while (j<k && arr[k] == arr[k+1]) k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
                
            }
        }
        return res;
    }

}