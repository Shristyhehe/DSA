Majority Element II (n/3)

At most 2 elements can appear more than n/3 times.

Maintain:
candidate1, count1
candidate2, count2

For each num:
1. If num == candidate1 → count1++
2. Else if num == candidate2 → count2++
3. Else if count1 == 0 → candidate1 = num, count1 = 1
4. Else if count2 == 0 → candidate2 = num, count2 = 1
5. Else → count1--, count2--

After first pass:
Candidates are only potential answers.

Second pass:
Count actual frequencies of candidate1 and candidate2.

Add candidate if frequency > n/3.

Time Complexity: O(n)
Space Complexity: O(1)

  //code

  class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // Two possible candidates because at most
        // 2 elements can appear more than n/3 times
        int candidate1 = 0;
        int candidate2 = 0;

        // Counts for the candidates
        int count1 = 0;
        int count2 = 0;

        // ---------- First Pass ----------
        // Find potential candidates
        for (int num : nums) {

            // Current number matches candidate1
            if (num == candidate1) {
                count1++;
            }

            // Current number matches candidate2
            else if (num == candidate2) {
                count2++;
            }

            // candidate1 slot is empty
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }

            // candidate2 slot is empty
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }

            // Current number matches neither candidate
            // and both slots are occupied
            // Cancel one occurrence from both candidates
            else {
                count1--;
                count2--;
            }
        }

        // ---------- Second Pass ----------
        // Verify actual frequencies of candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {

            // Count occurrences of candidate1
            if (num == candidate1) {
                count1++;
            }

            // Count occurrences of candidate2
            else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();

        // Add candidate1 if frequency > n/3
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }

        // Add candidate2 if frequency > n/3
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }
}


