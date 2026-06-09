/*Time Complexity: O(1)

Because the values and symbols arrays always contain 13 fixed elements, so the number of iterations is bounded and does not grow with the input number.

Space Complexity: O(1) (excluding the output string).*/

class Solution {
    public String intToRoman(int num) {
       // Roman numeral values in descending order
     int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
       // Corresponding Roman numeral symbols
     String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
     "IX", "V", "IV", "I" };
      //starting the index from largest value
     int i =0;
     StringBuilder sb = new StringBuilder();
     while(i<values.length){
       //will check if num s greater than the value at i then return that symbol and apppend in the sb and num-value to reduce the no again check at value[0] it's not 
       //there then i++ until value.length
        if(num >= values[i]){
            sb.append(symbols[i]);
            num -= values[i];
        }
        else{
            i++;
        }
     }
     return sb.toString();
    }
}

/*eg num= 3479
  i=0 and value[i] = 1000
  n3479> 1000 and in 1000 M is there append M in sb
  now 3479 - 1000 = 2479
  now i=0 
  2479 > 1000
  then again same......
  num = 479 i=0
  479 > 1000 (no)
  i++
  at value[3] it got 479 > 400
  append that symbol*/
