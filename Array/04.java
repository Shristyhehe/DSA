//Take an array of numbers as input and check if it is an array sortedd in acending order 
import java.util.Scanner;
class Arrays{
    public static void main(String args[]){
     System.out.println("Enter the size of the array");
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt(); // size of user
     int arr[] = new int[size];
     System.out.println("Enter the no. of  elements in array");
     for(int i=0; i<size; i++){ // taking input from user
      arr[i] = sc.nextInt();
     }
     int prev = arr[0]; // we have declare here because upar declare isliye nhi kiya kyuki  upar array he intialize nhi hua tha
     int curr;
     for(int i=1; i<arr.length; i++){
         curr = arr[i];
         if(prev > curr){
             System.out.println("Array is not sorted");
             return;
         }
         prev = curr; // aur curr toh chal he according to arr[i]; prev = curr is necessary because you need the previous array value, not just the previous value + 1.
     }
     System.out.println("Array is sorted");
    }
}
