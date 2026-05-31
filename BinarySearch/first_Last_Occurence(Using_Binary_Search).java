// USING THE BINARY SEARCH
import java.util.Scanner;
class Main {
    public static int FirstOccurence(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        int first = -1;
        while(low <=high){
            int mid = low + (high - low)/2;
            // if element is x then we need to check what if element exists in lower index also so go left side
            if(arr[mid] == x){
                first = mid;
                high = mid - 1;
            }
            // if element is smaller than x
            else if(arr[mid] < x){
            low = mid + 1;
            }
            // if element is larger than x
            else {
                high = mid - 1;
            }
        }
        return first;
    }
    public static int LastOccurence(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        int last = -1;
        while(low <=high){
            int mid = low + (high - low)/2;
            // if element is x then we need to check what if element exists in higher index also so go right side
            if(arr[mid] == x){
                last = mid;
               low = mid + 1;
            }
            // if element is smaller than x
            else if(arr[mid] < x){
            low = mid + 1;
            }
            // if element is larger than x
            else {
                high = mid - 1;
            }
        }
        return last;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the size of array");
        int n = sc.nextInt();
        System.out.println("the elements of array"); 
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the element to be searched in the array");
        int x = sc.nextInt();
        int first = FirstOccurence(arr,n,x);
        int Last = LastOccurence(arr,n,x);
        System.out.println("the first occurence of " + x + " at index : "  + first );
        System.out.print("the last occurence of " + x + "at index : " + Last );
    }
}
