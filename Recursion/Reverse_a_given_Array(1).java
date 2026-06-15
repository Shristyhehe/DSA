//using recursion
import java.util.Scanner;
class Main {
    public static void reverse(int arr[], int left, int right){
        if(left >= right){
            return;
        }
        //swapping
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        reverse(arr, left, right);
        for(int i=0; i<arr.length; i++){
   System.out.print(arr[i] + " ");
        }

    }
}
