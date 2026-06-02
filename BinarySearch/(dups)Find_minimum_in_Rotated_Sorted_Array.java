// this is my first Leetcide hardquestion and i solve it without looking at the code at all
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length; 
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;
          // this is for dups element like( 3,3,1,3)
           if(nums[low] == nums[mid]&& nums[mid] == nums[high]){
             ans =  Math.min(ans,nums[mid]);
                low++;
                high--;
               
                continue;
            }
          // this is for sorted array
            if(nums[low] <= nums[mid] && nums[mid] <= nums[high]){
                ans = Math.min(ans, nums[low]);
                break;
            }
             // this is to check if left side is sorted
            if(nums[low] <= nums[mid]){
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }
              // and this for right
            else{
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}
