class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find meeting point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find cycle entry
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}





Find Duplicate Number (287)

Observation:
- Array size = n + 1
- Values range = 1 to n
- Duplicate must exist

Treat array as:
index -> nums[index]

Example:
[1,3,4,2,2]

0 -> 1 -> 3 -> 2 -> 4 -> 2 ...

A cycle is formed. (if cycle is formed means dups exists)

Phase 1: (HHave to find the meeting point)
- Slow moves 1 step.
- Fast moves 2 steps.
- They meet somewhere inside the cycle.

Phase 2: (the cycle  first starting point ....meeting point is not always cycle start point)
- Put one pointer at the beginning.
- Keep the other at the meeting point.
- Move both one step.
- Where they meet again = cycle entry.

Cycle Entry = Duplicate Number

Complexity:
TC = O(N)
SC = O(1)
