class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() < 2){
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for(int  i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){   //this method skips non alphabetic ch
                sb.append(Character.toLowerCase(ch));  // this is used for converting into lowerCase
            }
        }
        
      int start = 0;   //the key idea is to check from starting and ending if the ch is matching till start< end then it is a palindrome
      int end = sb.length()-1;
      while(start < end){
        if(sb.charAt(start)==sb.charAt(end)){
            end--;
            start++;
        }
       else{
        return false;
       }
      }
      return true;
        }
}
