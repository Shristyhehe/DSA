// tc -> O(n+m) sc -> O(n+m);
//this is the optimal approach and two pointer approach
// in notebook the code is explained in pg 42
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array 1 :");
        int n = sc.nextInt();
        System.out.println("enter the size of array 2 :");
        int m = sc.nextInt();
        System.out.println("enter the elements of array 1:");
        int arr1[] = new int[n];
         for(int i =0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the elements of array 2:");
        int arr2[] = new int[m];
       
       
        for(int i =0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
         int union[] = new int [n + m];
       int i=0; 
       int j =0;
       int k =0;
       while( i< n && j<m){
           // if two arrays hai arr 1 ka element chota hai toh use dalenge union pe
           if(arr1[i] < arr2[j]){
               if(k == 0 || union[k-1] != arr1[i]) {
                   union[k] = arr1[i];
                   k++;
               }
               i++;
           }
           //if two arrays hai arr 1 ka element chota hai toh use dalenge union pe
           else if(arr2[j] < arr1[i]){
               if(k==0 || union[k-1] != arr2[j]){
                   union[k] = arr2[j];
                   k++;
               }
               j++;
           }
           // agar dono element he same ho in arr1 and arr2
           else{
               if(k==0 || union[k-1] != arr1[i]){
                   union[k] = arr1[i];
                   k++;
           }
           j++;
           i++;
       }
       }
       //for remaning elemnts what if arr1 pe elements hai but arr2 ka elements khtam ho gye
       while( i< n){
           if(k==0 || union[k-1] != arr1[i]){
                   union[k] = arr1[i];
                   k++;
       }
       i++;
    }
    
   //for remaning elemnts what if arr2 pe elements hai but arr1 ka elements khtam ho gye 
    while( j < m){
        if(k==0 || union[k-1] != arr2[j]){
            union[k] = arr2[j];
            k++;
        }
        j++;
    }
    //printing the elements of the array
    for(int x=0 ; x<k; x++){
        System.out.print(union[x] + " ");
    }
}
}
