/*if in question says element exists then use one pass Boyer-Moore Voting Algorithm (optimal)
    if it doesn't says that element exists or says may or may not exists then use two pass boyer moore voting tc ans sc is O(n) andO(1)
     Boyer-Moore Voting Algorithm finds the majority element by repeatedly canceling out different elements. 
     The majority element appears more than n/2 times, so it cannot be completely canceled and survives as the final candidate.
     The main idea of Boyer–Moore is:

Different elements cancel each other out.

If an element appears more than n/2 times, then even after all possible cancellations with other elements, it will still survive.
     
     That's the whole story. candidate = current winner, count = vote balance. when element exists ->*/
class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        // Find the majority candidate
        for (int num : nums) {

            // If count becomes 0,
            // choose current element as new candidate
            if (count == 0) {
                candidate = num;
            }

            // Same element supports candidate
            if (num == candidate) {
                count++;
            }
            // Different element cancels one vote
            else {
                count--;
            }
        }

        // Majority element is guaranteed to exist
        return candidate;
    }
}

//when element may or may not exists
class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        int freq = 0;

        for (int num : nums) {
            if (num == candidate) {
                freq++;
            }
        }

        // Check if candidate appears more than n/2 times
        if (freq > nums.length / 2) {
            return candidate;
        }

        return -1;
    }
}

//the better solution -> hashmap tc i O(n) and sc is O(n)
class Solution {
    public int majorityElement(int[] nums) {
      int mid = nums.length/2;
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0; i<nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
      }
      for(HashMap.Entry<Integer,Integer> entry :  map.entrySet()){
        if(mid < entry.getValue()){
            return entry.getKey();
        }
      }
      return -1;
    }
}
