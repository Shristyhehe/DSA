//optimal approach O(N)

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        System.out.println("enter the no of elemnts in an array :");
        int num[] = new int[size];
        for(int i=0 ; i<num.length; i++){
            num[i] = sc.nextInt();
        }
       int largest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;
       for(int i=0; i<num.length; i++){
           if(largest <  num[i]){
               secondLargest = largest;
               largest = num[i];
           }
           else if (num[i] != largest && num[i] > secondLargest){
               secondLargest= num[i];
           }
       }
        System.out.println("the largest no is :" +largest);
        System.out.println(" the second largest no is : " +secondLargest);
    }
}
