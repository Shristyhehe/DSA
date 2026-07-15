
/*this is not the optimized solution*/ -> bucket algo it is
//tc is O(n) and sc is O(1) page 8 of string to understan this problem and you need knowlegde of array lista and collections method 
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        ArrayList<HashMap.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        /*a - b means ascending order
          b-a means descending order 
          and negative a comes before b and positive means b comes before a and zero is both equal*/
        Collections.sort(list, (a,b) -> {
            if(!a.getValue().equals(b.getValue())){
                return b.getValue() - a.getValue();  // highest frequency
            }
            return a.getKey() - b.getKey(); // if frequency is same then which ch comes first
        });
       // printing the ch how many times its frequency is if e ->2 then e e
        for(HashMap.Entry<Character, Integer> entry : list ){
            for(int i=0; i<entry.getValue(); i++){
                System.out.print(entry.getKey());
            }
        }
    }
}
