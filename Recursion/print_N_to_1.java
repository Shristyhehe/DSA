import java.util.Scanner;
class Main {
    public static void num(int i, int n){
        if(i>n){
            return;
        }
        num(i+1, n);
        System.out.println(i);
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("enter the no of times you wanna print : ");
        int n = sc.nextInt();
        num(i, n);
    }
}

//i++ and i + 1 are not the same when passed as a function argument.

In your recursion:

num(i + 1, n);

i + 1 is calculated first, and the next call receives the increased value.

But if you write:

num(i++, n);

Java uses the current value of i first, then increments i afterward.
