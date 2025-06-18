class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gp=0,sp=0,target=0;
        while(gp<g.length && sp<s.length) {
            if(g[gp]<=s[sp]){
                sp++;
                gp++;
                target++;
            }
            else {
                sp++;
            }
        }
        return target;
    }
}