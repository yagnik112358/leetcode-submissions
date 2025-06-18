class Solution {
    public boolean canPartition(int[] nums) {
       int sum = Arrays.stream(nums).sum();
       if(sum%2 == 1)return false;
       return isSubsetSum(nums,sum/2);        
    }
    public boolean isSubsetSum(int[] arr, int target) {
      int n = arr.length;
      int k =target;

        var dp = new boolean[n+1][k+1];
     for(int i=0;i<=n;i++){
        for(int j=0;j<=k;j++){
            if(i==0){
                dp[i][j] = false;   
            }
            if(j==0){
                dp[i][j]=true;
            }
            
        }
      }
      for(int i=1;i<=n;i++){
        for(int j=1;j<=k;j++){
            dp[i][j]= dp[i-1][j];
            if(j >= arr[i-1]) {
                dp[i][j]= dp[i][j] || dp[i-1][j-arr[i-1]];
            }
        }
      }
      return dp[n][k];
    }
}
