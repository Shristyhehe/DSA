//time complexity O(n ^ 2); and space is O(1);
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int n = sc.nextInt(); // for size
        System.out.print("enter the target sum K : ");
        int k = sc.nextInt();
        System.out.print("enter the elements of the array :");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int max = 0;
        for(int i=0; i<n; i++){
            int count =0;
            int sum =0;
            for(int j=i; j<n; j++){
                sum = sum +  arr[j];
                if(sum == k){
                count = j-i +1 ; 
                }
            }
                if(max < count){
                    max = count;
                }
            }
      System.out.println("Longest subarray length with sum " + k + " is : " + max);   
}
}
