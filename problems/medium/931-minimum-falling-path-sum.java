class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        var dp = new int[n];
        var dpPrev = new int[n];
        for(int i =0;i<n;i++){
            dp[i]=matrix[0][i];
            dpPrev[i]=matrix[0][i];
        }
        for(int i = 1;i<n;i++){
            for(int j=0;j<n;j++){
                dp[j] = dpPrev[j];
                if(j>0){
                    dp[j] = Math.min(dp[j],dpPrev[j-1]);
                }
                if(j<n-1){
                    dp[j] = Math.min(dp[j],dpPrev[j+1]);
                }
                dp[j]+=matrix[i][j];
                // System.out.println(dp[j]+ " ");
            }
            for(int j=0;j<n;j++){
                dpPrev[j] = dp[j];
            }
        // System.out.println("");
        }
        int ans =Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            ans = Math.min(ans,dp[i]);
        }
        return ans;
    }
}