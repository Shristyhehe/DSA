//take an array of names as input from the user and print them on the screen
import java.util.Scanner;
class Arrays{
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
         System.out.println("Enter the names in the array");
        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }
        System.out.println("names are : ");
        for(int i=0; i<size; i++){
            System.out.println(names[i]);
        }
    }
}
