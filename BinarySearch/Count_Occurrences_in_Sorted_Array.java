//brue force approach using Linear search Tc is O(N) and sc = 1;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array :");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         System.out.print("Enter the elements to be searched : ");
        int x = sc.nextInt();
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println("the no of times the element " + x + " appeared in the array : " + count);
    }
}
