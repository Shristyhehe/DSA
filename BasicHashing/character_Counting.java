//character counting using hash with array
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        ///for small letter and similarly for capital letter
        // but for 256 char no need to write int[26]
       String s = sc.next(); 
       int hash[] = new int[26];
        for(int i=0; i<s.length();i++){
           hash[s.charAt(i) - 'a']++; // hash needs index 
        }
        // because in hashing using array we need the max no to create the hash
        for(int i=0; i<hash.length; i++){
            // the element which is greater than 0 return
            if(hash[i] > 0){
               System.out.println((char)(i+'a') +" " +hash[i]); 
            }
        }
        
    }
}
