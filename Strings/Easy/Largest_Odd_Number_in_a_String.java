//tc is O(n) and sc is O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i =  s.length() - 1;
        /* checking for last digit is odd or not
        (s.charAt(i) - '0') -> Convert the digit character at index i into its integer value."*/
           
            while(i>=0 && (s.charAt(i) - '0')  % 2 == 0){
                i--;
            }
                   int end = i;
                   //if no odd num exists
                   //return is used to stop the method immediately
                  // return → "I'm done, exit main() now." ✅
                   if(end == -1){
                       System.out.print("");
                       return;  
                   }
                   int j=0;
                   while( j < s.length() && s.charAt(j) == '0'){
                       j++;
                   }
                   // first digit or first non zero digit;
                   int start = j;
                  s = s.substring(start, end + 1);
        System.out.print(s);
    }
}
