/*1. Transpose the matrix.
2. Reverse every row.

Transpose:
• Swap only above diagonal (i < j)
• Swap matrix[i][j] ↔ matrix[j][i]
• Ignore diagonal (i == j)
• Ignore below diagonal (i > j)

Reverse:
• For every row
• left = 0
• right = n-1
• Swap until left < right

TC = O(N²)
SC = O(1)*/


class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;  i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i < j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            int j=0;
            int k = matrix[0].length-1;
            while(j < k){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }
}
