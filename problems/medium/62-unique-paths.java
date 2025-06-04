class Solution {
    
    public int uniquePaths(int m, int n) {
        // we require a string like DRDRD.. such that count(D) = n-1 count(R) = m-1;
        // (n+m-2)!/(n-1)!(m-1)!
        int num = n+m-2;
        if(n==1 || m==1) return 1;
        var dp = new int[m][n];
        for(int i =0 ;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        } 
        return dp[m-1][n-1];
    }
    Long factorial(int n, HashMap<Integer,Long> dp){

        if(dp.containsKey(n)){
            return dp.get(n);
        }
        Long result = n * factorial(n-1,dp);
        dp.put(n,result);
        return result;
    }
}