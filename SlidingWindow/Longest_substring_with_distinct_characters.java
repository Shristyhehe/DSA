class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        if( s == null){
            return 0;
        }
        int left = 0;
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                while(set.contains(ch)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(ch);
            }
            if(result < right - left + 1){
                result = right - left + 1;
            }
        }
        return result;
    }
}
