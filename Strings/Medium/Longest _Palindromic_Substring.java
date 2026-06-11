So the standard approach is: (center-expansion solution)

For each i
expand around (i, i)  -> odd length palindrome
expand around (i, i + 1)  -> even length palindrome
Keep the longest palindrome found.

That's all there is to the center-expansion solution

for every index i:
    check odd center (i, i)
    check even center (i, i+1)
    We're not checking both at the exact same time; we're checking both possible centers for every position because the longest palindrome could be either odd ("aba") or even ("abba").
    
    // 1. Check odd palindrome
left = i;
right = i;
// expand

// 2. Check even palindrome
left = i;
right = i + 1;
// expand

time complexity is O(n^2) and sc is O(1)

                                                 CODE

import java.util.*;
class Main{
  public static String LongestPalindrome(String s){
    if(s== null || s.length() < 2){
      return s;
    }
    String result = ""; //empty string
    for(int i=0; i<s.length(); i++){
      //odd palindrome length
      int left = i;
      int right = i;
      //if left is -1 and right = s.length
      while(left >=0 && right <s.length() && s.charAt(left) == s.charAt(right){
        if(result.length() < right - left + 1){
          result = s.substring(left, right+1);
        }
        //expanding
        left--;
        right ++;
      }
      //even palindrome length
      left = i;
      right = i + 1;
      while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
        if(result.length() < right - left + 1){
          result = s.substring(left, right + 1);
        }
        left--;
        right++;
      }
    }
    return result;
  }
}
