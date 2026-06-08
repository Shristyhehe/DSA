class Solution {
    public int maxDepth(String s) {
        int balance = 0;
        int result = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                balance++;
                result = Math.max(result, balance);
            }
            else if(ch == ')')
            {
                balance --;
            }
        }
        return result;
    }
}
