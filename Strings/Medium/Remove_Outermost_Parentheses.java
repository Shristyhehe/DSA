//Time Complexity: O(n)
//Space Complexity: O(n) (because ans can store up to almost all characters of the input)  where n is the length of the input string.
      


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
          StringBuilder ans = new StringBuilder();
        int balance = 0;
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == '(' ){
                balance ++;
                if(balance > 1){
                    ans.append(ch);
                }
                     
                }
            else{
                balance --;
                if(balance > 0){
                    ans.append(ch);
                }
            }
        }
        for(int i=0; i<ans.length(); i++){
            System.out.print(ans.charAt(i));
        }
         // or you can directly print sout(ans) without loop
    }
}
