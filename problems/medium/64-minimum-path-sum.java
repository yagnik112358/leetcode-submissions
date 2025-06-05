class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
        var dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == 0 && j==0){
                    dp[0][0] = 0;
                }
                else if(i==0){
                    dp[0][j] = dp[0][j-1];
                }
                else if(j==0){
                    dp[i][0] = dp[i-1][0];
                }
                else {
                    dp[i][j] = Math.min(dp[i-1][j] , dp[i][j-1]);
                }
                dp[i][j]+=grid[i][j];
            }
        }
        return dp[n-1][m-1];
    }
}