Store prefix products in answer[], traverse from right with a running suffix product, and multiply both to get Product Except Self in O(N) time and O(1) auxiliary space.
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        // First element has no elements on its left
        answer[0] = 1;

        // --------------------------
        // Pass 1: Store Prefix Product
        // answer[i] = product of all elements before i
        // --------------------------
        for (int i = 1; i < nums.length; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        // --------------------------
        // Pass 2: Multiply with Suffix Product
        // --------------------------
        int suffix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            // Multiply current prefix product with suffix product
            answer[i] = answer[i] * suffix;

            // Update suffix product for next iteration
            suffix *= nums[i];
        }

        return answer;
    }
}
