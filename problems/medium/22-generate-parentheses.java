class Solution {
    public List<String> generateParenthesis(int n) {
        // n =0 -> ""
        // n=1 -> "()"01
        // n=2 -> "()()","(())"0101,0011
        //"((()))"000111,"(()())"001011,"(())()"001101,"()(())"010011,"()()()"010101

        var result = new ArrayList<String>();
        backtrack(result, "",0,0,n);
        return result;
    }
    public void backtrack(List<String> result, String current, int open, int close, int max){
        if(current.length() == max*2){
            result.add(current);
            return;
        }
        if(open<max){
            backtrack(result,current+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(result,current+")",open,close+1,max);
        }
    }

}