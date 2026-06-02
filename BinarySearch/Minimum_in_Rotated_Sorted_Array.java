//Tc is O(log base 2 n); sc is O(1)
import java.util.Scanner;
class Main {
    public static int minimumElement(int arr[], int n) {
        int low =0;
        int high = n-1;
        int ans = Integer.MIN_VALUE;
        while(low <=high){
            int mid = low + (high - low)/2;
            //if the array is sorted
            if(arr[low] <= arr[mid] && arr[mid] <= arr[high]){
                ans = Math.min(ans, arr[low]);
                break;
            }
            //checking the left part 
   //if left part is sorted then the low is the smallest element and we will move to unsorted part(which is right)to check if smaller element exists

            if(arr[low] <= arr[mid]){
               ans = Math.min(ans,arr[low]);
               low = mid + 1;
            }
          
                //for right to be sorted the arr[mid] <= arr[high]
                //Left half is unsorted, so the minimum lies in this half(right half).
             // arr[mid] can be a candidate for the minimum.
           else{ 
           ans = Math.min(ans, arr[mid]);
           high = mid - 1; //aage jayenge kyuki right agar sorted hai toh toh arr[mid] he chota hoga isliye search space kam krenge
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
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int min = minimumElement(arr, n);
        System.out.println("the minimum element in the rotated search array : is " + min);
    }
}
