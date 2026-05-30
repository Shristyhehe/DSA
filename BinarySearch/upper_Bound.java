//TIME COMPLEXITY AND SC IS SAME AS BINEARY SEARCH
import java.util.Scanner;
class Main {
    public static int UpperBound(int arr[], int n, int target){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            // if element is greater than target we will go to left side to search is there any other smallest index where element i greater than the target element
            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else{
                //if element is smaller than the target go to right side
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int n = sc.nextInt();
         System.out.print("enter the elements of the array : ");
         int arr[] = new int[n];
         for(int i =0; i<arr.length; i++){
             arr[i] = sc.nextInt();
         }
             System.out.print("enter the target element : ");
             int target = sc.nextInt();
             int result = UpperBound(arr, n, target);
System.out.println("the smallest index at which the element greater than target element is : " + result);
    }
}
