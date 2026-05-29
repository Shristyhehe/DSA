import java.util.Scanner;
class Main {
    public static void BubbleSort(int arr[], int n){
     //   i determines the comparison range.
        for(int i=n-1; i>=1; i--){
           // j moves through that range and performs the comparisons. and j is index please remind it
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
