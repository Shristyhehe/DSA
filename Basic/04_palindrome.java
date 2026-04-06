class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }
        int n = x; // to store the original value of x
       int rev = 0;
       while(x != 0){
        rev = rev * 10 + (x  % 10);
        x = x / 10; //taking out the last element
       }
       if(rev == n) {
        return true;
       }
       return false;
    }
}
