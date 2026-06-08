//tc is O(n) and sc is O(1)

class Solution {
    public int percentageLetter(String s, char letter) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        if(!map.containsKey(letter)){
            return 0;
        }

          int ans =  (int) (( (double)  map.get(letter) / s.length()) * 100); 
          return ans;
    }
}


// double nhi lagata toh agar freq = 2 and s length is 10 which will be freq/length 0.2 but without double it would have come 0 and * 100 wrong ans
and int is to round the result if its 33.3 -> 33 , 44.5 -> 44
