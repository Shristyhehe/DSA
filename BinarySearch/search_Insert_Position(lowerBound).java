we solve it using lower bound algo

//TIME COMPLEXITY AND SC IS O(log n) sam as bs lowerbound and upper bound
import java.util.Scanner;
class Main {
    public static int searchPosition(int arr[], int n, int target){
        int low = 0;
        int high = n-1;
        int ans =n;
        while( low <=high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            }
             return ans;
        }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("enter the elements of the array  : ");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the no to be inserted ");
        int target = sc.nextInt();
        int result = searchPosition(arr,n,target);
        System.out.print("the element should be inserted in the position : " + result);
    }
}
