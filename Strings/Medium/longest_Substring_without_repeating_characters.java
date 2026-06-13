// using sliding window
first i thought that i need t shrink the window until duplicate ch is found but the key idea was if duplicate exists then we need to remove it from the set by moving leftt
    until the ch doesn't exist in the set  

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
                // if ch exists then until and unless the ch is not there in the set
                while(set.contains(ch)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(ch); // if ch is not there then add the ch
            }
            if(result < right - left + 1){
                result = right - left + 1;
            }
        }
        return result;
    }
}
























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
