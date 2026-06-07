/*here we use the idea of concatinate and .contains() string method
  tc is O(n)  
  TC: O(n) because after concatenation the string length becomes 2n, and we search for goal only once in this string. 
  Since 2n is just a constant multiple of n, the complexity is O(n).
sc is O(n) due to concatenation*/

import java.util.*;
class Main{
  public static boolean rotateString(String s, String goal){
    if(s.length() != goal.length()){
      return false;
    }
String concat = s + s;
    return concat.contains(goal);
  }
}


  /*return concat.contains(goal); ->if (concat.contains(goal)) {
    return true;
} else {
    return false;
}*/
