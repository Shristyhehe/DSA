import java.util.*;
class Main {
    public static void InsertionSort(int arr[],  int i, int n){
        if(i==n){
            return;
        }
        for(int j=i; j>=1;j--){
            if(arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j] = temp;
            }
            else{
                break;
            }
        }
        InsertionSort(arr, i + 1, n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =  sc.nextInt();
        }
        int i = 1;
       InsertionSort(arr,i,n);
       for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
