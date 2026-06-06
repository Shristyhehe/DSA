// check the notebook for understanding the code page no 5
//tc is O(n * m) and sc is O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
           // Stores the common prefix
        StringBuilder ans = new StringBuilder();
         // Traverse character by character in the first string
        for (int i=0; i<s[0].length(); i++){
             // Check the same index 'i' in all other strings
            for(int j=1; j<s.length; j++){
           // Case 1: Current string ended
                // Example: "flow" and i = 4     
                  // Case 2: Characters don't match
                if( i>=s[j].length() || s[j].charAt(i) != s[0].charAt(i)){
                    System.out.print(ans.toString());
                    return;
                }
            }
            // If all strings matched at index i,
              // add that character to the answer
          ans.append(s[0].charAt(i));
              
          
        }
          // Entire first string is a common prefix
    System.out.print(ans.toString());
    }
}
