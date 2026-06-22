class Solution {
    public int[] twoSum(int[] nums, int target) {

        // HashMap stores: number -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array once
        for (int i = 0; i < nums.length; i++) {

            // Find the number needed to reach the target
            int n = target - nums[i];

            // Check if the required number exists
            if (map.containsKey(n)) {

                // Return indices of the two numbers
                return new int[]{map.get(n), i};
            }

            // Store current number and its index
            // This is done after checking so that we don't use
            // the same element twice
            map.put(nums[i], i);
        }

        // No valid pair found
        return new int[]{-1, -1};
    }
}
