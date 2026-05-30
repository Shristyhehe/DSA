//very very important algorithm
//Time complexity is O(logbase2(n)) or O(log n) and sc is o(1)
import java.util.Scanner;
class Main {
    public static int LowerBound(int arr[], int n, int target){
         int low = 0;
        int high = n-1;
         int ans = n;
        while(low <= high){
            int mid = low + (high -  low) / 2;
            //agar arr[mid] >= target toh hum left side pe check krenge kya pata index aur chota mile
                   if(arr[mid] >= target ){
                    ans = mid;
                    high = mid - 1;
                   }
                //if mid elemnt is smaller than the target
                else{
                   low = mid + 1;
                   
                   
                }
                }
                return ans;
            }
            
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the size of the array :");
       int n = sc.nextInt();
       System.out.print("enter the elements of the array : ");
       int arr[] = new int[n];
       for(int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }
       System.out.print("enter the element x : ");
        int target = sc.nextInt();
        int result = LowerBound(arr,n,target);
        System.out.println("the smallest index at which the target found is : " + result);
}
    }
    
    
    
    
   
