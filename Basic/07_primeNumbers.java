// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prime no : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if( n <=1){
            isPrime = false;
            return;
        }
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n %i == 0){
               isPrime = false;
               break;
            }
        }
            if(isPrime){
                System.out.println(n + " is a prime no");
            }
            else {
                System.out.println(n + " is not a prime no :");
        }
    }
}


/*Why only till square root?

Because factors always come in pairs.

Example for 36:

1 × 36
2 × 18
3 × 12
4 × 9
6 × 6

After 6 (which is √36), the factors repeat in reverse.

So if a number has a factor greater than √n, then it must also have a factor smaller than √n.

That means:

no need to check till n-1
checking till √n is enough

Example with 49

49=7
2

Loop becomes:

for(int i = 2; i <= 7; i++)

When i = 7:/*
