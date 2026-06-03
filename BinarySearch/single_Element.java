//Time complexity O(log N) sc = 1;
import java.util.Scanner;
class Main {
    public static int SingleElement(int arr[], int n){
        // we have trim the search space
        int low = 1;
        int high = n-2;
        if(n == 1){
            return arr[0];
        }
        // if first element is not equal to second then first element is the single element
        if(arr[0] != arr[1]){
            return arr[0];
        }
       // if last element is not equal to second last tehn last element is the single element
        if(arr[n-1] != arr[n-2]){
            return arr[n-1];
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] != arr[mid + 1] && arr[mid] != arr[mid -1]){
                return mid ;
            }
            // (even, odd) -> which means left side is in pair so eliminate left side and check single element in the right side
            if(mid % 2 == 1 && arr[mid] == arr[mid - 1] || mid % 2 ==0  && arr[mid] == arr[mid + 1]){
                low = mid + 1;
            }
            //(odd,even) -> which means right side is in pair so eliminate right side and check single element in the left side
            else{
                high = mid - 1;
            }
        }
        // if no single element is there
        return -1;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("enter the element of the array : ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int Single = SingleElement(arr,n);
        System.out.print("The single element is : " +Single);
    }
}
