import java.util.Scanner;
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i); // because hashmap needs key or num to store wherease hash needs index so it can store the element 
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
       /* HashMap.Entry<K, V> is used to represent one key-value pair in a HashMap.
          HashMap<Integer, Integer> map = new HashMap<>();

                 map.put(10, 3);
                 map.put(5, 2);
                 map.put(15, 1);
                   Each of these pairs is a HashMap.Entry.
                      For example:
                    (10, 3) is one Entry.
                     map.entrySet() returns a set of all key-value pairs (entries) in the HashMap.*/
    for(HashMap.Entry<Character, Integer> entry : map.entrySet()){
        System.out.println(entry.getKey() + " " + entry.getValue());
    }

    }
}
