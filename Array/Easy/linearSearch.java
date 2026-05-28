//time complexity o(n); and sc = 0(1)
import java.util.Scanner;
class Main {
    public static int linearSearch(int arr[], int n){
        for(int i=0; i<arr.length; i++){
            if(n == arr[i]){
                System.out.print("element is found at index : " );
                 return i;
               
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("enter the elements in the array :");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element you want to  search :");
        int n = sc.nextInt();
        int result = linearSearch(arr, n);
        System.out.println(result);
    }
}
