//to check if array is sorted or not
import java.util.Scanner;
class Solution{
    public static boolean num(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the element of the array :");
        for(int i= 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean result = num(arr);
        System.out.print(result);
    }
}


        
  // we have a solve a provblem of leetcode also but here sorted and rotated sorted is there(rotated sorted means that last element is comparent with the first element)
//Because a rotated sorted ascending array can have only one breaking point/drop.
    }

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[(i+1) % nums.length]){ //This is needed because in rotated sorted arrays, we also compare:last element with first element


                count ++;
            }
        }
        return count <=1;
    }
}

/*count <= 1

means:
3 > 4 → false
4 > 5 → false
5 > 1 → true
1 > 2 → false
2 > 3 → false
sorted array → 0 breaks
sorted & rotated → 1 break
otherwise → invalid.*/
