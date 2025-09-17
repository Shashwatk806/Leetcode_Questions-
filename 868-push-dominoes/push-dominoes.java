class Solution {
    public String pushDominoes(String dominoes) {
        return solve(dominoes);
    }
    private String solve(String dominoes){
        int n = dominoes.length();
        char[] arr = dominoes.toCharArray();
        int[] forces = new int[n];
        int val = 0;
        for(int i=0;i<n;i++){
            if(arr[i]=='R'){
                val=n;
            }else if(arr[i] == 'L'){
                val =  0;
            }else{
                val = Math.max(val-1,0);
            }
            forces[i] += val;
        }
        for(int i = n-1;i>=0;i--){
            if(arr[i] == 'L'){
                val = n;
            }else if(arr[i]=='R'){
                val=0;
            }else{
                val = Math.max(val-1,0);
            }
            forces[i] -= val;
        }
        StringBuilder sb = new StringBuilder();
        for(int force : forces){
            if(force>0) sb.append('R');
            else if(force<0) sb.append('L');
            else sb.append('.');
        }
        return sb.toString();
    }
}