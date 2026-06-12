import java.util.Scanner;
class Solution{
  public static void recursion(int count, int n, String name){
    if(count == n){
      return;
    }
    System.out.print(name + " " );
    recursion(count + 1, n, name);  //recursive call is just a normal function call, so it needs all the arguments required by the function signature.
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int count =0;
    System.out.print("enter the name you want to print : " );
      String name = sc.nextLine();
      System.out.print("enter the no like how many times you want to print : ");
      int n = sc.nextInt();
      Recursion(count, n, name);
    }
}
