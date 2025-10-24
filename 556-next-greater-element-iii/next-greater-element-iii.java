class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = (""+n).toCharArray();
		int i = arr.length-1;
		while(i>0 && arr[i - 1] >= arr[i]) {
			i--;
		}
		if(i ==0) {
			return -1;
		}
		i--;
		int j = arr.length-1;
		while(arr[j] <= arr[i]) {
			j--;
		}
		swap(arr, i,j);
		reverse(arr,i+1,arr.length-1);
		long num = Long.parseLong(new String(arr));
		if(num > Integer.MAX_VALUE) {
			return -1;
		}else {
			return (int) num;
		}
	}
	private static void reverse(char[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		while(si<ei) {
			swap(arr,si,ei);
			si++; ei--;
		}
	}
	private static void swap(char[] arr, int i, int j) {
		// TODO Auto-generated method stub
		char temp = arr[i];
		arr[i] =arr[j];
		arr[j] = temp;
    }
}