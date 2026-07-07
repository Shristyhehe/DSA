HASHSET SOLUTION (BETTER APROACH) 
 
import java.util.HashSet;

class Solution {
    public void setZeroes(int[][] matrix) {

        // Stores rows containing a zero
        HashSet<Integer> rows = new HashSet<>();

        // Stores columns containing a zero
        HashSet<Integer> cols = new HashSet<>();

        // Pass 1: Find all zeros and store their row/column
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {

                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        // Pass 2: Make cell zero if its row or column is marked
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (rows.contains(i) || cols.contains(j)) {

                    matrix[i][j] = 0;
                }
            }
        }
    }
}
