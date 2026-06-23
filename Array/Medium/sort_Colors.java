brute and better -> this solution can be done using counting or bubble sort(any sorting technique) O(n2) and sc is O(1)
in counting we count the 0 1 and 2 and put it into the array

the optimal approach is Dutch National Flag Algorithm.


//Dutch National Flag Algorithm
// 0s -> left side
// 1s -> middle
// 2s -> right side
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public void sortColors(int[] nums) {

        // low -> position where  0 should be placed
        int low = 0;

        // mid -> current element being processed
        int mid = 0;

        // high -> position where  2 should be placed
        int high = nums.length - 1;

        // Process elements until mid crosses high
        while (mid <= high) {

            // If current element is 1, it is already in correct region
            if (nums[mid] == 1) {
                mid++;
            }

            // If current element is 2, move it to the right side
            else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                // Shrink the 2's region
                high--;

                // Do not increment mid here because
                // the swapped element from the right
                // has not been processed yet
            }

            // If current element is 0, move it to the left side
            else {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                // Expand the 0's region
                low++;

                // Move to the next element
                mid++;
            }
        }
    }
}

this is counting approach ->
class Solution {
    public void sortColors(int[] nums) {
        //count the nums like how many times 0 appears 1 appears and c appears 
       int a = 0;
       int b = 0;
       int c = 0;
       int k = 0;
       for(int i = 0; i<nums.length;i++){
        if(nums[i] == 0){
            a++;
        }
        else if(nums[i] == 1){
            b++;
        }
        else{
            c++;
        }
       }
       // now putting count into the array first 0
      while(a > 0){
        nums[k] = 0;
        k++;
        a--;
      }
      //now putting 1
      while(b > 0){
        nums[k] = 1;
        k++;
        b--;
      }
      //now putting 2
      while(c>0){
        nums[k] = 2;
        k++;
        c--;
      }
