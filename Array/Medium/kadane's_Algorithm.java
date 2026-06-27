/*Kadane's Algorithm (Maximum Subarray Sum)

Idea:
If the running sum becomes negative, it will reduce the sum of any future subarray.
So discard the negative prefix and start a new subarray.

Steps:
1. Add current element to sum.
2. Update maxSum.
3. If sum < 0, set sum = 0.

Why?
A negative running sum hurts future subarrays, while starting fresh gives a larger sum.
  Kadane:
Negative running sum = bad prefix.
Drop it and start fresh.
Keep track of maxSum throughout traversal.
  tc is O(n) and sc is O(1)*/

class Solution{
  public static int MaximumSum(int arr[]){
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i =0; i<arr.length; i++){
      sum += arr[i];
      maxSum = Math.max(sum, maxSum);
      if(sum < 0) {
        sum = 0;
      }
    }
    return maxSum;
  }
}


  
