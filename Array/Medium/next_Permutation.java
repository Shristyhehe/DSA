tc is O(N) and sc is O(1)
  class Solution {
    public void nextPermutation(int[] nums) {
      int index = -1;

 /*Find the first index from the right where
arr[i] < arr[i+1].

If no such index exists,
the array is the largest permutation,
so reverse the entire array.*/

      
      for(int i= nums.length-2; i>=0; i--){
        if(arr[i] < arr[i+1]){
          index = i;
          break;
        }
      }
//no such index exists 
  if(index == -1){
    int start = 0;
    int end = nums.length-1;
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] =  temp;
      start++;
      end--;
    }
  }

      /*Start from the end and find the first element
greater than arr[i].

Since the suffix is in decreasing order,
the first element from the right that is
greater than arr[i] is the smallest greater element.*/

  for(int j= nums.length-1; j>=index+1; j--){
 /*Swap arr[i] with that element.*/
    
    if(arr[j] > arr[index]){
      int temp = arr[j];
      arr[j] = arr[index];
      arr[index] = temp;
      break;
    }
  }

/*Then reverse the suffix
(arr[i+1] to end)
because it is in decreasing order.

Reversing it makes it ascending,
which gives the next permutation.*/

      
  int start = index +1;
  int end  = arr.length-1;
      while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
      }
    }
}
