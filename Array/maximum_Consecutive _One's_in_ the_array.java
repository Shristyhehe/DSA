// optimal approach TC -> O(n) sc is O(1)
import java.util.Scanner;
class Solution{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n = sc.nextInt();
    int arr[] = new int[size];
     System.out.println("enter the elements of the array");
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    int count =0;
    int maxCount = 0;
    for(int i=0; i<arr.length; i++){
      if(arr[i] == 1) {
        count++;
      if(count > maxCount) {  // to compare kaunsa ka value jyada hai agar count ka jyada hai toh maxCount pe dal de
        maxCount = count;  
      }
      }
      if(arr[i] == 0){
        count = 0; // if arr[i] is 0 hai then count ho jayega reset which means 0 
      }
    }
    System.out.println("the max consecutive is : " + maxCount);
  }
}
