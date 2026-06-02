//the key idea is find the  minimum element in the rotated sorted array and it's index is the no of times the array has been rotated (distinct) and for the dups you can do that shrink one 
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int low =0;
        int high = n-1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[low] <= arr[mid] && arr[mid] <= arr[high]){
                if(arr[low] <arr[ans]){
                    ans = low;
                    break;
                }
                 
                
            }
            //checking for left sorted [part]
            if(arr[low] <= arr[mid]){
    // if it is sorted we will check if the value of low is smaller than value of ans then if yes update the ans with the low index  
                if(arr[low] <arr[ans]){ 
                    ans = low;
                    
                }
               low = mid + 1;
                }
                else{
                    //if mid element is smaler than ans element then update ans with mid element index
                    if(arr[mid] < arr[ans]){
                         ans = mid;
                    }
                   
                    high = mid - 1;
                    }
                    
            }
             System.out.println("the rotation done is :" + ans);
   
    }
}
