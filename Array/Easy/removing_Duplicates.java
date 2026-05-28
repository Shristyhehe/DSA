// time complexity o(n2);

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("enter the elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int curr[] = new int[size];
        int k =0;
        
       /* k is used to keep track of the position where the next unique element will be stored in curr[].
        
        //curr = [0,0,0,0,0]
       //k = 0 means:
“First unique element should go at index 0.”*/
        
        for(int i=0 ; i<arr.length; i++){
            boolean isDuplicate = false;
            for(int j=0; j<k; j++){
                if(arr[i] == curr[j]){ // to check if duplicate is there
                    isDuplicate = true;
                break;
                }
                
            }
            if(!isDuplicate){
                curr[k] = arr[i];
                k++;
            }
        }
        System.out.println("arrray after removing the duplicates ");
        for(int i=0; i<k; i++){
            System.out.println(curr[i] + " ");
        }
    }
}


// OPTIMAL APPROACH
// time complexity 0(n)

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array :");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int k = 0; // because 1st index pe unique no he hota hai
        for(int j=1; j<arr.length; j++){
            if(arr[k] !=  arr[j]){
               arr[k+1] = arr[j];
               k++;
            }
        }
        System.out.println("array after removing duplicates :");
        for(int i=0; i<=k; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
