//Take a matrix from the user.search for a given number x and print the indices at which it occurs

import java.util.Scanner;
class TwoDArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows in th array");
        int rows = sc.nextInt();
         System.out.println("Enter the cols in th array");
         int cols = sc.nextInt();
         int num[][] = new int[rows][cols];
         System.out.println("Enter the elements in the array");
         //input  from the user 
         //rows
         for(int i=0; i<rows; i++){
             //cols
             for(int j=0; j<cols; j++){
                 num[i][j] = sc.nextInt(); //storing the elements of rows and cols in num[i][j]
             }
         }
         System.out.println("Enter the no you want to search :");
         int x = sc.nextInt();
         int check = 0; //false
         for(int i=0; i<rows; i++){
             //cols
             for(int j=0; j<cols; j++){
                 if(num[i][j] == x) {
                     System.out.println("No found at index: [" + i + "," + j + "]");
                     check = 1; 
                     break;
                 }
             }
         }
         if(check == 0){
             System.out.println("no not found enter valid no");
         }
    }
}
