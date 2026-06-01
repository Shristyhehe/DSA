//check notebook for the understanding page 01 in notebook 2
TC is O(logbase2 n) and worse case can be O(n/2)//what if alot dups exists so we shrink almost half of the size of array
import java.util.Scanner;
class Main {
    public static boolean SearchElement(int arr[], int n, int target) {
        int low =0; 
        
        int high = n - 1;
        while(low <=high){
        int mid = low + (high - low)/2;
        // if mid is the element
        if(arr[mid] == target){
            return true;
        }
         /*Duplicates at low, mid, and high make it impossible to determine
         which half is sorted, so shrink the search space.*/
        if(arr[low]==arr[mid] && arr[mid]==arr[high]){
               low++;
             high--;
             continue; // what if multiple dups do exist so we need to shrink that
        }
        // to check if left part is sorted( it inclued element of mid also)
        if(arr[low] <= arr[mid] ){
            //if it sorted does the target is present in left side 
        if(arr[low] <= target && target <= arr[mid]){
            high =  mid - 1; // if yes then high - 1;
            
        }
        // if target not present the check right side
         else{
            low = mid + 1;
        }
        }
        // now right is sorted if left is not
        // checking if right side contains the element 
       else{
           if(arr[mid] <= target && target <= arr[high]){
               low = mid + 1; // if yes then low = mid + 1;
           }
           else{
               high = mid - 1; // else check left side
           }
       }
    }
    return false; // if the element doesn't exists
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
      boolean result =  SearchElement(arr,n,target);
       System.out.print(result);
    }
}
