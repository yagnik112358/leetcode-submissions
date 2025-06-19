class Solution {
    public int coinChange(int[] coins, int amount) {
        // HashMap<Integer,Integer> dp = new HashMap<>();
        // return fun(coins,amount,0,dp);
        var dp = new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++){
            for(int j=0;j<=amount;j++){
                if(i==0){
                    dp[i][j]=-1;
                }
                if(j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                dp[i][j] = Integer.MAX_VALUE;
                if(j>=coins[i-1]){
                    if(dp[i][j-coins[i-1]] !=-1){
                        dp[i][j]= 1+dp[i][j-coins[i-1]];
                    }
                    if(dp[i-1][j] !=-1){
                        dp[i][j] = Math.min(dp[i][j],dp[i-1][j]);
                    }
                    if(dp[i][j] == Integer.MAX_VALUE){
                        dp[i][j] =-1;
                    }
                    
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[coins.length][amount];
    }
    // not correct 
    public int fun(int[]coins, int amount, int count, HashMap<Integer,Integer> dp){
        if(amount == 0)return count;
        // int originalAmt=amount;
        if(dp.containsKey(amount)){
            // return dp.get(amount);
        }
        int minCoins = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amount>= coins[i]){
                minCoins = Math.min(minCoins, fun(coins,amount-coins[i],count+1,dp));
            }
        }
        minCoins  = minCoins==Integer.MAX_VALUE ? -1: minCoins;
        // dp.put(originalAmt,minCoins);

        // System.out.println("(amount)"+originalAmt +" "+dp);
        return minCoins;
    }
    
}