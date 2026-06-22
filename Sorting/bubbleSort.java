import java.util.Scanner;
class Main {
    public static void BubbleSort(int arr[], int n){
        if(n==1){
            return;
        }
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        BubbleSort(arr, n-1);
    }
    
    
    //same time complexity O(n square)
  and here sc is O(n)

