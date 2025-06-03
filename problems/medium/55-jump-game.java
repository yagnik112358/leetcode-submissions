class Solution {
    public boolean canJump(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,0);
        return reach(0,nums,dp);
    }
    public boolean reach(int pos, int[] nums,int[] dp) {
        if(dp[pos] == -1)return false;
        if(pos >= nums.length-1) return true;
        var end = pos + nums[pos];
        if(end>=nums.length) return true;
        for(int i=pos+1; i<=end; i++) {
            if(reach(i,nums,dp)) return true;
        }
        dp[pos] = -1;
        return false;
    }
}