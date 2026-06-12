// this is optimal but more optimal does exists
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if( s == null){
            return 0;
        }
       if(s.length() == 1) {
            return 1;
        }
        int result = 0;
        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                if(!map.containsKey(ch)){
                  map.put(ch, map.getOrDefault(ch, 0) + 1);
                } 
                else{
                    break;
                }
            }
            if(result < map.size()){
                result = map.size();
            }
        }
      return result;
    }
}
