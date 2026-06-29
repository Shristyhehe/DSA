/*this is using tc O(N) and sc O(N) because two array list we have taken this approach is also optimal but here we are creating two list of positive and negatve then again 
copying the value back in the array
 but we can use another array while traversing the nums array if num is positive put it in even index of result and i negative put it into odd index 
 this will also take O(N) tc and O(N) sc but less code is required*/

//array one ->
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[] = new int[nums.length];
         int even=0;
        int odd =1;
      for(int i=0; i<nums.length; i++){
        if(nums[i] > 0){
            result[even] = nums[i];
            //next even index
            even +=2;
        }
        else{
            result[odd] = nums[i];
            //next odd index
            odd += 2;
        }
      }
     return result;
    } 
}


//taking list
class Solution {
    public int[] rearrangeArray(int[] nums) {
      List<Integer> positive = new ArrayList<>();
      List<Integer> negative = new ArrayList<>();
      for(int i=0; i<nums.length; i++){
        if(nums[i] < 0){
            negative.add(nums[i]);
        }
        else{
            positive.add(nums[i]);
        }
      }
      int j=0;
        int k =0;
      for(int i=0; i<nums.length; i++){
        if(i % 2 == 0){
            nums[i] = positive.get(j);

            j++;
        }
        else{
            nums[i] = negative.get(k);
            k++;
        }
      }
      return nums;
    }
}
