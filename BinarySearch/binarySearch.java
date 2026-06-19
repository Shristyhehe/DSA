class Solution{
public static int BinarySearch(int arr[], int low, int high, int target){
if(low > high) {
return -1;
}
int mid = low + (high - low)/2;
if(arr[mid] == target){
return mid;
}
if(arr[mid] < target){
       // ye call krega bs ko if jo
            // If that call finds the answer (say index 4),
        // it returns 4 to this call.
        // This call immediately returns the same 4
        // to its caller.
low = mid + 1;
return BinarySearch(arr,low,high,target);
}
else{
     //similarly for this
high = mid - 1;
return BinarySearch(arr,low,high,target);
}
}
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =  sc.nextInt();
        }
        int target = sc.nextInt();
        int low = 0;
        int high = n-1;
        int result = BinarySearch(arr,low,high,target);
        
        System.out.println("the element found at index : " + result);
    }
}
