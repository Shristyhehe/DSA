// brute force approach 
// the optimal approach is REVERSE ALGORITHM

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int k = sc.nextInt();
    //for left rotation   
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
         
            for(int j=0 ; j<k; j++){
                int temp = arr[0];
                //for left rotation
                for(int i=0; i<arr.length-1; i++){
                     arr[i] = arr[i+1];
                    
                }
                 arr[arr.length-1]= temp;
            }
           
        for(int i=0; i<arr.length; i++){
             System.out.println(arr[i] + " ");
        }
       
       
       
       
       //for right  rotation
     class Solution {
    public void rotate(int[] nums, int k) {

        for(int r = 0; r < k; r++) {

            int temp = nums[nums.length - 1];

            for(int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = temp;
        }
    }
}
