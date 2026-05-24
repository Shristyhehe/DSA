// time complexity -> O(n)
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int size = sc.nextInt();
        System.out.println("enter the elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i< size; i++){
            arr[i] = sc.nextInt();
        }
        
        int curr[] = new int[size];
        for(int i=1; i<arr.length; i++){
            curr[i-1] = arr[i]; 
            curr[arr.length - 1] = arr[0];
            
        }
        
        /*here i is accessing from array of index 1 but in curr we need to insert from 0th index ...and the last element of curr will be first element of array(0th index)*/
        for(int i=0; i<curr.length; i++){
             System.out.print(curr[i] + " ");
        }
       
    }
}
