//to check if array is sorted or not
import java.util.Scanner;
class Solutions{
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of elements you want :");
        int size = sc.nextInt();
        System.out.println("enter the elements of the array :");
        int arr[] = new int[size];
       
        for(int i=0; i< size; i++){
            arr[i] = sc.nextInt();
        }
            boolean isCheck = true;
            for(int i=0; i<(arr.length-1); i++){ /// we have taken arr.length-1 because we have comparing arr[i] and arr[i+1] we if go till n then index will be out of bound
                int curr = arr[i];
                if(curr <=arr[i+1]){  // if(arr[i] <= arr[i+1]  or [arr[i] > arr[i-1] here we can go till arr.lngth]
                    isCheck = true;
                 
                }
            else{
                System.out.println("array is not sorted");
                isCheck = false;
                break;
            }  
            
            }
          if(isCheck){
                System.out.println("array is sorted");
            }
        }


  // we have a solve a provblem of leetcode also but here sorted and rotated sorted is there(rotated sorted means that last element is comparent with the first element)
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

sorted array → 0 breaks
sorted & rotated → 1 break
otherwise → invalid.*/
