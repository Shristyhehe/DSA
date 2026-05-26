//brute force aproach
//Tc is O(n2) and  sc is O(1)
import java.util.Scanner;
class Solution{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size:");
    int size = sc.nextInt();
    System.out.println("enter the elements in the array:");
    int arr[] = new int[size];
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<arr.length; i++){
      int count =0;
      for(int i=0; i<arr.length; i++){
        if(arr[i] == arr[j]){
          count++;
        }
      }
      if(count==1){
        System.out.println("the num that apppears only once is : " + arr[i] );
      }
    }
  }
}
