/*HashMap → data structure used to store data in key-value pairs
<Integer, Integer> →
first Integer = type of key
second Integer = type of value
map → object/reference variable name
new HashMap<>() → creates the hashmap object*/

// TC is O(n) and sc is O(1)

import java.util.HashMap;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("enter the target sum K :");
        int k = sc.nextInt();
        System.out.println("enter the elements of the array : ");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map =  new HashMap<>();
        int sum =0;
        int maxLength = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            // if sum itself is k
            if(sum ==k){
            maxLength = i+ 1;
            }
            //if sum = k nhi hai
            int rem = sum - k;
            // if remaining prefix sum already exists
            if(map.containsKey(rem)){
                int len = i - map.get(rem); //mi hai current index and .get(rem) pe uska elemnt
                if(len > maxLength){
                    maxLength = len;
                }
            }
            //first occurenc of sum ya fir first occurence of the prefix
            if(!map.containsKey(rem)){
                map.put(sum, i);
            }
        }
        
     System.out.println("Longest subarray length is: " + maxLength);
    }
}
