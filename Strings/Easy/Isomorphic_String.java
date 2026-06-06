/*tc is O(n) and sc is O(1)
why sc is O(1)  -> Because the maps store at most a fixed number of characters (e.g., ASCII), their size doesn't grow with n, so the space complexity is O(1).*/
//check notebook for definition and example


import java.util.*;
class Main {
    public static boolean Isomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        /*First map (s → t)  e -> a  ,g  -> d  ,g-> d
         This checks: Does the same character in s always map to the same character in t?*/


         /* Second map (t → s)
        
            a -> e   d -> g   d -> g
            This checks: Does the same character in t always come from the same character in s?*/


        
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            
        
           
           char chS = s.charAt(i);
           char chT = t.charAt(i);
           
              // this is for s-> t
           // if key existss does the key has the same value which was previously stored


              if(mapST.containsKey(chS) ){
                    if(mapST.get(chS) !=  chT){
                        return false;
                    }
                }
                else{
                     mapST.put(chS, chT);
                }
               
                // now t->s reverse also
                if(mapTS.containsKey(chT)){
                    if(mapTS.get(chT) != chS){
                        return false;
                    }
                }
                else{
                    mapTS.put(chT, chS);
                }
            }
            return true;
                
            }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
       boolean result = Isomorphic(s, t);
        System.out.print(result );
    }
}
