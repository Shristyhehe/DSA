// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n; // to store the value of n (becomes after the first loop the n becomes 0
        int org = n;
        int count =0;
        int sum = 0;
        while( n !=0){
            n = n/10; // removing the last element
            count++;
        }
        while(org !=0){
            int digit = org % 10; // we have intialize a new variable because the org becomes 0 
            sum = sum + (int)Math.pow(digit, count);
            org = org / 10;
        }
        if (sum == temp) {
            return true;
        }
        else {
            return false;
        }
    }
}
