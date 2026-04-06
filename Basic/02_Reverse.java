class Solution {
    public int reverse(int x) {
     
     long rev = 0;
     while(x!= 0){
        int lastDigit = x % 10; //to get the last diggit only
        rev = rev * 10 + lastDigit;
        x=x/10; // to remove the last element
         if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)return 0; //here we have use if to check if the rev is out of bound of the int
     }   
     return (int)rev;
    }
}

//here the time complexity is order of O(log N)
