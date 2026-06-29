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
