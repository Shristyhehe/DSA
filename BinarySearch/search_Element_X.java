
// timecomplxity is O(logbase2 n) or O(log n)and sc = O(1)
import java.util.Scanner;
class Main {
   public static int BinarySearch(int arr[],int n, int target){
       
        int low = 0; // low starts from 1st num or 0th index
        int high = n-1; // start from last num or n-1th index
        while( low  <= high){
            //case for overFlow
            int mid =  low + (high - low)/2;
            //if elemnt is found at mid
            if(arr[mid] == target){
                return mid;
            }
            // when elemmt is smaller than the target
           else if(arr[mid] < target){
                low = mid + 1;
                //high stays same
            }
            //arr[mid] > target
            else{
                 high = mid - 1;
            }
        }
        //when element is not found when high < low
        return -1;
   }
        public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the size of the array : ");
        int n = sc.nextInt();
      System.out.print("enter the elements in the array  : ");   
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element you want to search : ");
        int target = sc.nextInt();
        int result = BinarySearch(arr, n,target);
        System.out.print("the element found at index : " + result);
}
}
