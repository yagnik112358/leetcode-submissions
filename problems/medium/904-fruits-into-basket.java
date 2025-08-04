class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length == 1) return 1;

        int x =fruits[0];
        int y = -1;
        int ans =0;
        int count =1;
        for(int i=1;i<fruits.length;i++){
            if(fruits[i] == x || fruits[i] == y) count++;
            else {
                count =1;
                int k = i-1;
                while(k>=0 && fruits[i-1] == fruits[k]){
                    k--;
                    count++;
                }
                if(x == fruits[i-1]) y= fruits[i];
                else x = fruits[i];
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}