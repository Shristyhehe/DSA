// brute force approach pe we have to sort the array first(like ascending order) after that we will access the last element as it is in sorted order a
and last element will be the largest(n-1)

optimal approach will be intilizing current elemnt with integer.min value and comparing it with arr[i] if arr[i] is greater than 
curr becomes the arr[i]


// this is using the function
import java.util.Scanner;
class Solution{
    public static int findLargest(int arr[], int size){
        int curr = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            if(curr < arr[i]){
                curr = arr[i];
            }
        }
        return curr;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("enter the no. of elements in an array");;
        int num[] = new int[size];
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        int result = findLargest(num, size); // if we didn't use static in function then humhe oject banana parta
            System.out.println("the largest element in the array is :" + result); and these are the actual parameters and other notes are beloow
    }
}

and this is without using the function
*import java.util.Scanner;class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entetr the size of the array :");
        int size = sc.nextInt();
        System.out.println("Enter the element of the array :");
        int num[] = new int[size];
        //filling the elements of the array
        for(int i=0; i<size; i++){
            num[i]= sc.nextInt();
        }
        int curr = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(curr < num[i]){
                curr = num[i];
            }
        }
        
        System.out.println("the largest element of array : " +  curr);
    }
}

NOTES --->

Formal = Function side

(written while creating function)

Actual = Calling side

(written while calling function)



| Type              | Belongs To | How to Call        |
| ----------------- | ---------- | ------------------ |
| `static` method   | class      | `methodName()`     |
| non-static method | object     | `obj.methodName()` |
