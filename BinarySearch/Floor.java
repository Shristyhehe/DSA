//Floor ->largest element <= target
import java.util.Scanner;
class Main {
    public static int Floor(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;
      
    int ans = -1; // here we have taken -1 not n because here if element is not found return -1;
while(low <= high){
    int mid = low + (high - low)/2;
    //element chota hai target se toh hum right side jayenge to check 
          //aur bada elment chota then target
          //whatever you get here will also be largest than previous one because search eliminates the search space
    if(arr[mid] <= target){
        // here we are storing the element if question is index then ans = mid;
            ans = arr[mid];
        low = mid + 1;
    }
    // if element he bada aagya targt se
    else{
        high = mid - 1;
    }
}
//return the largest index the element which is smaller than target
return ans;
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

