//check page 7(notebook for better understanding 

import java.util.Scanner;
class Main {
    public static int PeakElement(int arr[], int n){
    int low = 1;
    int high = n-2;
    if(n==1){
        return 0;
    }
    
    if(arr[0] > arr[1]){
        return 0;
    }
    if(arr[n-1] > arr[n-2]){
        return n-1;
    }
    while(low <= high){
        int mid = low + (high - low)/2;
        if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
            return mid;
        }
        // increasing order curve so peak will lie always on right side
       else if(arr[mid - 1] < arr[mid]){
            low = mid + 1;
        }
        // decreaing curve so peak will lie on left side
        else{
            high = mid - 1;
        }
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    int Peak = PeakElement(arr, n);
    System.out.print("the peak element is at index : " + Peak);
    }
}
