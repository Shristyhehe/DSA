/*tc is O(n) because hashmap is created for string length s as both string lentgh is same
and sc is O(1)*/
import java.util.*;
class Main {
    public static boolean Anagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch) - 1){
                if(map.get(ch) < 0){
                    return false;
                }
            }
            
               //s > t eg is s "aab" and t is ab
           /* freq == 0 → counts match.
               freq > 0 → s has more of that character.
               freq < 0 → t has more of that character.*/
           // For each value in the map, put that value into freq and check it.
            for(int freq : map.value()){
                if(freq != 0){
                    return false;
                }
            }
        }
        return true;
    }
        System.out.println("Start small. Ship something.");
    }
}
