// ceil is same as lowerbound but if the element is not found we have to return -1 if no = 85 ceil will be 90
import java.util.Scanner;
class Main {
    public static int Ceil(int arr[],int target){
        int low = 0;
        int high = n-1;
        int ans = -1;
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
        System.out.print("enter the element in the ceil ");
        int target = sc.nextInt();
        int result = Ceil(arr,n,target);
        System.out.print("the element for the ceil is  : " + result);
    }
}
