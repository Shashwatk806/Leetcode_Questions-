class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
    public void sort(int[] nums, int l, int r){
        if(l>=r) return;
        int mid = l+(r-l)/2;
        sort(nums,l,mid);
        sort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    public void merge(int[] arr,int l, int mid, int r){
        int[] temp = new int[r-l+1];
        int i=l;
        int j=mid+1;
        int k = 0;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        for(int a=0;a<temp.length;a++){
            arr[l+a] = temp[a];
    }
    }
}