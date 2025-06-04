class Solution {
    public int jump(int[] nums) {
        var dp = new int[nums.length];
        // approach 1: recursion with memoization beat 10% solution
        // Arrays.fill(dp, -1);
        // if(nums.length == 1) return 0;
        // dp[nums.length-1]=0;
        // return reach(0,nums,dp);

        //approach 2: iterative bottom up DP
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<nums.length;i++){
            var maxJump = Math.min(i+nums[i], nums.length-1);
            for(int j= i+1; j<=maxJump;j++){
                dp[j]= Math.min(dp[j], dp[i]+1);
            }
        }
        return dp[nums.length-1];
    }
    public int reach(int cur, int[]nums, int[] dp){
        if(dp[cur]!=-1){
            return dp[cur];
        }
        int min =nums.length;
        var end = cur+nums[cur];
        if(end>=nums.length-1){
            dp[cur] =1;
            return 1;
        } 
        for(int i =cur+1;i<= end;i++) {
            min = Math.min(min,1+reach(i,nums,dp));
        }
        dp[cur] = min;
        return dp[cur];
    }
    // not used
    public boolean reachPossible(int n, int cur, int maxJump){
        return (cur + maxJump >= n-1);
    }
}