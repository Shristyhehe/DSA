/*Parameterized recursion → answer is built while going down the recursive calls. and it's base class returns
Functional recursion → answer is built while coming back up from the recursive calls.*/
//parameterized recursion 


   import java.util.Scanner;
    class Main {
    
      public static void Add(int n, int sum){
          if(n<1){
              System.out.print(sum);
              return;
         }
         Add(n-1, sum + n); // This is called parameterized recursion because you're carrying the answer (sum) as a parameter through each recursive call.
        }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int sum = 0;
     Add(n, sum);
     }
 }

//function recursion
import java.util.Scanner;
class Main{
    public static int Add(int n){
        if(n ==0){
            return 0;
        }
        return n + Add(n-1);
    } 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Add(n);
        System.out.print(result);
}
}
