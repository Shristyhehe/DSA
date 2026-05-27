// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//brute force aproach(Time complexity 0(N))

/*import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1){
            System.out.println("the no is negative");
            return;
        }
        System.out.print("the divisor of " + n  + "are : "); 
        for(int i=1; i<=n; i++){
            if( n % i == 0){
                if ( i !=n){
                    System.out.print(i + " , "); // 
                }
                else {
                  System.out.print(i);  
                }
            }
        }
     
    }
}*/

/*This checks:
that if (i!=n)
if i is NOT the last divisor (n)
→ print comma
otherwise
→ print only the number*/

//optimal approach here
/*The optimized approach works till √N instead of going till N.
o(root n)
Because divisors always come in pairs.

Example for 36:

1 × 36
2 × 18
3 × 12
4 × 9
6 × 6

After 6 (which is √36), the pairs start repeating.

So instead of checking till 36, we only check till 6.*/

import java.util.Scanner;
class divisor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("the divisor of " + n + "are :");
        for(int i=1; i*i<=n; i++){
            if (n % i == 0){
                System.out.print(i + " ");
                if( i != n/i){    //This condition is usually used while printing factors/divisors of a number.
                    System.out.print(n/i + " ");
                }
            }
        }
    }
}
