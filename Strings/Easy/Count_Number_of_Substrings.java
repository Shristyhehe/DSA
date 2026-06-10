/* tc is O(n) and sc is 0(k) because map needs to store k distinct values
"Before shrinking, the map may have more than k distinct characters."
because constants are ignored.that's why we say O(k) rather than "exactly k".*/
import java.util.*;
class Main {
    public static int CountString(String s, int k){
        //exactly k distinct = atmost(k) - atmost(k-1)
        return atmostK(s,k) - atmostK(s, k-1);
    }
       public static int atmostK(String s, int k){
           int left = 0;
        int count = 0;
         HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            while(map.size() > k){ // if map size is > k that means we have more than k distinct characters
            char sh = s.charAt(left); // here we got the character of left
            int freq =  map.get(sh);  // now we here we got the value of the ch
               freq--;  // make it --; and put it into the map but check
             if(freq == 0){
                 map.remove(sh);// check if frequency is 0 then remove it from map else
             }
             else{
                 map.put(sh, freq);
             }
             left++; // move left forward
    
       }
       count += (right -  left + 1); // total substring
        } 
        return count;
       
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int result = CountString(s, k);
        System.out.print(result);
    }
}
