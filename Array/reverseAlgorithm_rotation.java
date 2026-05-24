// REVERSAL ALGORITHM(rotation)
//TIME COMPLEXITY 0(N) AS SAME AS BRUTE FORCE BUT SC IS 0(1)
// to understand this code page no 39 of notebook


import java.util.Scanner;
class Main{
  public static void reverse(int arr[], int start, int end){
      while(start < end){
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
      }
  }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("enter the no of rotations K :");
        int k = sc.nextInt();
        System.out.println("enter the elements in the array :");
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        k = k % size;
      // for left
        // reverse the first k elements
        reverse(arr,0,k-1);
        //reverse the remaining elemnts
        reverse(arr, k, size-1);
        //reversing the whole array
        reverse(arr,0, size-1);


      // for right
      // Step 1
        reverse(nums, 0, nums.length - 1);

     // Step 2
    reverse(nums, 0, k - 1);

// Step 3
reverse(nums, k, nums.length - 1);
        //printing the arrays
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
