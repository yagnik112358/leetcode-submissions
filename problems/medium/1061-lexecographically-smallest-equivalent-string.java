class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        var alpha = new int[26];
        var len = s1.length();
        Arrays.fill(alpha,-1);
        int k=1;
        for(int i=0;i<len;i++){
            if(alpha[s1.charAt(i)-'a'] == -1 && alpha[s2.charAt(i)-'a'] == -1){
                alpha[s1.charAt(i)-'a'] = k;
                alpha[s2.charAt(i)-'a'] = k;
                k++;
            }
            else if(alpha[s1.charAt(i)-'a'] != -1 && alpha[s2.charAt(i)-'a'] != -1){
                // alpha[s2.charAt(i)-'a'] = alpha[s1.charAt(i)-'a'];
                int temp = alpha[s2.charAt(i)-'a'] ;
                int target = alpha[s1.charAt(i)-'a'];
                for(int j=0;j<26;j++){
                    if(alpha[j]==temp){
                        alpha[j]=target;
                    }
                }
            }
            else if(alpha[s1.charAt(i)-'a'] != -1){
                alpha[s2.charAt(i)-'a'] = alpha[s1.charAt(i)-'a'];
            }
            else {
                alpha[s1.charAt(i)-'a'] = alpha[s2.charAt(i)-'a'];
            }
        }
       

        StringBuilder sb = new StringBuilder();
        for(int i =0 ;i<baseStr.length();i++){
            if(alpha[baseStr.charAt(i)-'a'] != -1) {
                
                for(int j=0;j<26;j++){
                    if(alpha[j] == alpha[baseStr.charAt(i)-'a']){
                        sb.append((char)('a'+j));
                        break;
                    }
                }
            }
            else {
                sb.append(baseStr.charAt(i));
            }
        }
        return sb.toString();
    }
}