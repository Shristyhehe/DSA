tc is O(m + n) and sc is O(1)
  
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int column = matrix[0].length - 1;
        while(top < matrix.length && column >= 0){
            if(matrix[top][column] == target){
                return true;
            }
              
            // Current value is smaller than the target.
            // This entire row can be eliminated because every element
            // to the left is even smaller.
              
            else if(matrix[top][column] < target){
                top++;
            }
               // Current value is greater than the target.
            // This entire column can be eliminated because every element
            // below is even greater.
              
            else {
                column--;
            }
        }
      // We searched all possible positions and didn't find the target.
        return false;
    }
}
