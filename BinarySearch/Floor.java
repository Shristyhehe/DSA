//Floor ->largest element <= target if arr[] is 10 20 30 40 60 70 then x = 25 the floor will be the lrgest element which is equal to or less than 25 so 
//largest element less than or equal to floor = 20 
import java.util.Scanner;
class Main {
    public static int Floor(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;
      
    int ans = -1; // here we have taken -1 not n because here if element is not found return -1;
while(low <= high){
    int mid = low + (high - low)/2;
   /* if elelemt is smaller than the target we will move to right side to check whether largest element smaller than or equal to target exists*/
    
    if(arr[mid] <= target){
       
            ans = arr[mid];   // here we are storing the element if question is index then ans = mid; 
        low = mid + 1;
    }
    
    else{
        high = mid - 1;  // if element he bada aagya targt se move to left side
    }
}
return ans;  //return the largest index the element which is smaller than target
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size");
        int n = sc.nextInt();
        System.out.print("enter the elements in the array : ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         System.out.print("enter the floor element");
        int target = sc.nextInt();
        int result = Floor(arr, target);
        System.out.println("the floor of this element is : + result);
    }
}

