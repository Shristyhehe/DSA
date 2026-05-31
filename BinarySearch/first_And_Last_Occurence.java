// time complexity is 2 * (log base 2n)
import java.util.Scanner;
class Main {
    // for first occurence of the element
    public static int lowerBound(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        int ans = n;
        while( low<= high){
            int mid = low + (high - low)/2;
            // if element is larger or equal to the target we will move to left side to find the smallest index but thr same element
            if(arr[mid] >= x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    //lastOccurence
    public static int UpperBound(int arr[], int n, int x){
        int low =0;
         int high = n-1;
        int ans = n;
        while( low<=high){
            int mid = low + (high - low)/2;
            //if the eleemnt is larger than the target move to the left side
            if(arr[mid] >x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }
        System.out.print("enter the elemen to be searched  : ");
        int x = sc.nextInt();
        // element doesnt exits or lb == n then
        int lb = lowerBound(arr, n, x);
        if(lb == n || arr[lb] != x){
             System.out.println("First Occurrence = -1");
            System.out.println("Last Occurrence = -1");
        }
        int first = lb;
        //here we didn't check the element exists or not because lb does check it
         int Ub = UpperBound(arr, n, x);
        int last =  Ub - 1;
        System.out.println("the first occurence of element is : " + first);
        System.out.println("the last occurence of element is : " + last);
    }
}

  or

// creating the fucntion for if lb != element or lb == n
static int[] firstAndLastOccurrence(int[] arr, int n, int x) {
    int lb = lowerBound(arr, n, x);
    if (lb == n || arr[lb] != x){ 
        return new int[]{-1, -1}; 
    }
    int ub = upperBound(arr, n, x);
    return new int[]{lb, ub - 1}; 
    
}

public static void main(String[] args) {
    int[] ans = firstAndLastOccurrence(arr, arr.length, x); 
    // because in ans[] the arary will be containing only lb and ub and lb is in first place[0] and ub is in 2nd place[1]
    
    System.out.println("First Occurrence: " + ans[0]); 
    System.out.println("Last Occurrence: " + ans[1]);
