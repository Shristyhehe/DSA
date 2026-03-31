//Take an input from the user and print the elements of the array
import java.util.Scanner;
class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int rows = sc.nextInt();
         System.out.println("Enter the no of cols : ");
        int cols = sc.nextInt();
        int num[][] = new int[rows][cols];
        //input from the user 
       
        System.out.println("Enter the elements in the array: ");
         //rows k liye
        for(int i=0; i<rows; i++){
            //cols
            for(int j=0; j<cols; j++){
                num[i][j] = sc.nextInt(); //rows and cols ka element store horaha hai
            }
        }
        //output(printing the cols and rows)
        System.out.println("the elements of the array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
} 
