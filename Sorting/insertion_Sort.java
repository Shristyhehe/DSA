//TC is O(n^2) for worst and average and best is O(n) in case of sorted array and sc is O(1);
import java.util.Scanner;
class Main {
    public static void InsertionSort(int arr[], int n){
        // i picks the element till the end
        for(int i=0; i<arr.length; i++){
            //j should check from ith index
             int j =i;
              //j will check the element from ith to 0 index
              while( j > 0 && arr[j-1] > arr[j]){ 
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--; // to check the previous element also
                }
        }
            for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print(" enter the elements of the array : ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr, n);
       
    }
        }
        
