//tc is O(n) and sc is O(1)
class Solution {
    public boolean isPalinSent(String s) {
        // code here
        if(s == null || s.length() < 2){
            return true;
        } 

      // here we are not taking another string or stringbuilder we are directly comparing start with end
        int start = 0;
        int end = s.length()-1;
        while(start < end){
          // converting the start ch into lowercase similarly for end
            char ch = Character.toLowerCase(s.charAt(start));
            char sh = Character.toLowerCase(s.charAt(end));
        
          //if the ch is not alphabteic then start++ and ch will contain small letter and start < end
            while(!Character.isLetterOrDigit(ch) && start < end){
                start++;
                ch = Character.toLowerCase(s.charAt(start));
            }
           //if the ch is not alphabteic then end -- and ch will contain small letter and end > start
            while(!Character.isLetterOrDigit(sh) && end > start){
                end--;
                sh = Character.toLowerCase(s.charAt(end));
            }
          //now comparing ch and sh (both alphabetic) is yes then start++ and end--
            if(ch == sh){
                start++;
                end--;
            }
              //else false is ch != sh
            else{
                return false;
            }
        }
        return true;
    }
}









start never goes back
end never goes back

So the inner loops are not doing N work for every outer iteration. They are sharing the same total N movements.

A useful way to think about it:

Each character is examined at most once from the left
and at most once from the right.

So even though you see three while loops, the total number of pointer movements is still proportional to the length of the string.
