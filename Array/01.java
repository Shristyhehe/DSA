//taking an array as input from the user. search the element for a given number x nd print thr index at which it occurs(my first array question)

import java.util.Scanner;

class Arrays{
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the num you want to search");
        int n =sc.nextInt();
        int check = 0;
        for(int i=0; i<size; i++){
            if(num[i] == n){
                System.out.println("Num is found at index : " + i);
                check = 1;
                break;
            }
            
        }
        if(check==0) {
               System.out.println("num not found");
            }
    }
}
