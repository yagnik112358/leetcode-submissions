class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        var n = triangle.size();
        int[] dpprev = new int[n];
        int[] dp = new int[n];
        dpprev[0] = triangle.get(0).get(0);
        dp[0] = triangle.get(0).get(0);
        for(int i=1;i<n;i++) {
            for(int j=0;j<=i;j++){
                dp[j] = triangle.get(i).get(j) + checkAndFind(dpprev,j,i);
            }
            for(int j=0;j<=i;j++){
                dpprev[j] = dp[j];
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            ans = Math.min(ans,dp[j]);
        }
        return ans;
    }
    public int checkAndFind(int[] dp, int j, int i){
        if(j==0){
            return dp[0]; 
        }
        if(j==i){
            return dp[j-1];
        }
        return Math.min(dp[j],dp[j-1]);
    }
}
