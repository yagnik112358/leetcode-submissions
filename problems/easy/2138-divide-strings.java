class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int lastLen = n%k;
        int ansLen = n/k;
        if(lastLen!=0) ansLen++; 
        String [] ans = new String[ansLen];

        for(int i=0;i<(n-lastLen);i+=k){
            StringBuilder sb = new StringBuilder();
            ans[i/k]= s.substring(i,i+k);
        }
        // last string
        if(lastLen!=0){
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(n-lastLen));
            while(lastLen<k){
                sb.append(fill);
                lastLen++;
            }
            ans[ans.length-1]=sb.toString();
        }
        return ans;
    }
}