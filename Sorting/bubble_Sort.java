//Tc is similar to selection sort which is O(n^2) for worsse and average case but for best case O(n) and sc is O(1)
import java.util.Scanner;
class Main {
    public static void BubbleSort(int arr[], int n){
     //   i determines the comparison range.
        for(int i=n-1; i>=1; i--){
            int didSwap = 0;
           // j moves through that range and performs the comparisons. and j is index please remind it
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){ // the array is already sorted eg of array ( 1 2 3 4 5 6)
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array :");
    int n = sc.nextInt();
    System.out.print("Enter the elements of the array :");
    int arr[] = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    BubbleSort(arr,n);
    }
}
