// If current value < next value, subtract; otherwise, add
//TC is O(n) only one loop and sc is O(1) because only 7 ch hashmap 
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Roman numeral string
        String s = sc.next();

        // Store Roman numeral values
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        // Traverse the Roman numeral
        for (int i = 0; i < s.length(); i++) {

            // Current Roman numeral character
            char ch = s.charAt(i);

            // Check if next character exists
            // and current value is smaller than next value
            if (i + 1 < s.length() &&
                map.get(ch) < map.get(s.charAt(i + 1))) {

                // Special case:
                // IV = 5 - 1
                // IX = 10 - 1
                // XL = 50 - 10
                // XC = 100 - 10
                // CD = 500 - 100
                // CM = 1000 - 100
                sum += map.get(s.charAt(i + 1)) - map.get(ch);

                // Skip the next character
                // because it has already been processed
                i++;
            }
            else {

                // Normal case:
                // Add current Roman numeral value
                sum += map.get(ch);
            }
        }

        // Print final integer value
        System.out.println(sum);
    }
}
