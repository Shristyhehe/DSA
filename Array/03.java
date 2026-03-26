// find the max and minimum number in an array of integers
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = arr[0];
        int min = arr[0];
        System.out.println("enter the elements of the array");
       for(int i=0; i<size; i++){ // this loops is for inserting the array elemets
           arr[i] = sc.nextInt();
       }
       for(int i=1; i<arr.length; i++){
           if(max < arr[i]){
               max = arr[i];
           }
           if(min > arr[i]){
               min = arr[i];
           }
           
       }
       System.out.println("max no is " + max);// we have print the statement out of the loop because everytime jab tak loop chalega aur jab jab max no milega woh print kr jayega isliye humne max pe arr ka  value store kr diya similarly for min
           System.out.println("min no is " + min);
    }
}
