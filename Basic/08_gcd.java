import java.util.Scanner;
class gcd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no : ");
        int n1 = sc.nextInt();
        System.out.println("enter the second no :");
        int n2 = sc.nextInt();
        if (n1 < n2){ // if n2 is greater then
            int temp = n1;
            n1 = n2;
            n2= temp;
        }
        while( n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2; 
            n2 = rem;
        }
        System.out.println("the gcd of n1 and n2 is : " + n2);
    }
}
