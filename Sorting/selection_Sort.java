// time complexity O(n ^ 2) and space complexity is O(1);
import java.util.Scanner;
class Main {
    
    public static void SelectionSort(int arr[], int x){
        //last element it will not check because last element will sorted
        for(int i=0; i<arr.length -1; i++){ 
              int minIndex = i; //assuming it is the smallest element(so storing it's index)
    
    /* inner loop ->  it doesn't sort anything.It only keeps asking:
"Have I found a smaller element than the current minimum?"
 and updates minIndex accordingly.*/

              for(int j=i; j<arr.length; j++){
                  if(arr[j] < arr[minIndex]){
                      minIndex = j;
                  }
              }
          
              // for swapping
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
      
        // for printing the nums
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt(); 
        System.out.print("Enter the elements of the array : ");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
      
         SelectionSort(arr,n);
    }
}
