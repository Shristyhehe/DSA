Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 class Solution{
  public static boolean validPalindrome(String s){
    // Two pointers from both ends
    int start = 0;
    int end = s.length()-1;
    while(start < end){
      char ch = s.charAt(start);
      char sh = s.charAt(end);
      // If characters match, move inward
      if(ch == sh){
        start++;
        end--;
      }
          // First mismatch found
      else{
        // Option 1:
                // Pretend left character is deleted
                // Check if remaining substring is palindrome

                // Option 2:
                // Pretend right character is deleted
                // Check if remaining substring is palindrome

        return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end);
      }
    }
     // No mismatches found
    return true;
  }
  private static boolean isPalindrome(String s, int start, int end){
    // Normal palindrome check
    while(start < end){
      if(s.charAt(start) != s.charAt(end){
          // If mismatch occurs, not a palindrome
        return false;
      }
       // Move inward
      start++;
      end--;
    }
      // All characters matched
    return true;
  }
}
