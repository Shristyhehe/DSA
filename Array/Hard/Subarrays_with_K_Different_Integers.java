//same to same wohi count substrings with k distincts string wala but here it is an array

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return almostK(nums, k) - almostK(nums, k-1);
    }

    public static int almostK(int[] nums, int k){
        int left =0;
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right<nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(map.size()> k){
                int n = nums[left];
               int freq = map.get(n);
               freq--;
               if(freq == 0){
                map.remove(n);
               }
               else{
                map.put(n, freq);
               }
               left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
