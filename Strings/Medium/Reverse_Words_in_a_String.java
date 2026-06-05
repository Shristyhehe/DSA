tc and sc is O(n)
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
          //eg string length is 11 so i will start from 0 to 10
        int i = s.length()-1;
        while( i>=0){
            /* removing spaces if that comes after the last word
               eg (" hello world    ") this loop will remove the spaces from last word*/
            while(i>=0 && s.charAt(i)==' '){
                i--;
            } 
            //is used to stop the loop when there are no more words left.
            if(i<0){
                break;
            }
            // end stores the index of the last character of the current word
            int end = i;
            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }
             /* After moving left until a space,
                start = i + 1 gives the first character
                       of the current word.

                   Example:
                   hello  world
                         ^
                         i (at space)

                       start = i + 1 -> points to 'w'
                          */
            int start = i + 1;
            //in ans we are appending the words (world hello)
            ans.append(s.substring(start, end + 1));
            
           /* Skip spaces between words.

                Example:
                           hello___world
                                ^^^
                              spaces

                   Move i left until it reaches the previous word.
                              */
               while (i >= 0 && s.charAt(i) == ' ') {
                        i--;
                        }
            // if we have still words left this is to add spae betwwen the words in the output (reverse) String
            if(i>=0){
                ans.append(" ");
            }
        }
      System.out.print(ans.toString());
    }
}
