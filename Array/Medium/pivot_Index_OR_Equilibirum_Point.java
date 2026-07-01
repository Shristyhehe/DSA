/*Why it works

At index i:

totalSum = leftSum + nums[i] + rightSum

Therefore:

rightSum = totalSum - leftSum - nums[i]

You:

Calculate rightSum.
Compare leftSum and rightSum.
Update leftSum for the next index.*/
tc is O(N) and sc is O(1)




class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int left = 0;
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum  += arr[i];
        }
        for(int i=0; i<arr.length; i++){
            if(left == totalSum - left  - arr[i]){
                return i;
            }
            left += arr[i];
        }
        return -1;
    }
}
