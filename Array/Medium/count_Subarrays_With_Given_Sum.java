
/*1. Current Prefix - Previous Prefix = k

2. Previous Prefix = Current Prefix - k

3. HashMap stores:
   Prefix Sum → Frequency
   (NOT Prefix Sum → Index)

tc is O(N) and sc is O(N)



exaplnation  is after the code.*/



class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;                 // Stores total number of valid subarrays
        int currentPrefix = 0;         // Running prefix sum

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs once before the array starts
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            // Calculate current prefix sum
            currentPrefix += nums[i];

            // Previous prefix sum needed
            int removePrefix = currentPrefix - k;

            // If found, all its occurrences form valid subarrays
            if (map.containsKey(removePrefix)) {
                count += map.get(removePrefix);
            }

            // Store/update current prefix sum frequency
            map.put(currentPrefix,
                    map.getOrDefault(currentPrefix, 0) + 1);
        }

        return count;
    }
}





/*explanation ->

Why Prefix Sum?

Current Prefix represents:

Sum from index 0 to current index.

Example:

nums = [1,2,3]

Prefix Sums

1
3
6

Suppose:

Current Prefix = 6
Target = 3

Need:

6 - 3 = 3

Previous Prefix:

3 = (1+2)

Subtract:

(1+2+3)
-
(1+2)

= 3

Remaining subarray:

[3] */
