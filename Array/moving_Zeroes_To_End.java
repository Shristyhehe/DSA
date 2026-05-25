//Optimal approach
//TIME COMPLEXITY = O(n) and Space complexity O(1)
import java.util.Scanner;
class Solution{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    System.out.println("Enter the elememts of the array :");
    int arr[] = new int[size];
    for(int i=0; i<size; i++) {
      arr[i] = sc.nextInt();
    }
    int k = 0;
    //NON zeroes element 
    for(int i=0; i<arr.length; i++) {
      if(arr[i] != 0) {
        arr[k] = arr[i];
        k++;
      }
    }
    //now handling zeroes elemnt
    for(int i=k ; i< arr.length; i++) {
      arr[i] = 0;
    }
    //printing the arrays
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i] + " ");
    }
  }
}
