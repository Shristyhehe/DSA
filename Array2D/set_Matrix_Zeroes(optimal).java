tc is O(M X N) and sc is O(1);

class Solution {

    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Tracks whether column 0 should become zero
        int col0 = 1;

        // ==========================
        // MARKING PHASE
        // ==========================

        for (int i = 0; i < rows; i++) {

            // If any element in column 0 is zero
            // remember it separately
            if (matrix[i][0] == 0) {
                col0 = 0;
            }

            // Start from column 1 because
            // column 0 is used as row markers
            for (int j = 1; j < cols; j++) {

                if (matrix[i][j] == 0) {

                    // Mark the row
                    matrix[i][0] = 0;

                    // Mark the column
                    matrix[0][j] = 0;
                }
            }
        }

        // ==========================
        // CONVERSION PHASE
        // ==========================

        // Traverse from bottom-right
        // so markers are not destroyed early
        for (int i = rows - 1; i >= 0; i--) {

            for (int j = cols - 1; j >= 1; j--) {

                // If row marker OR column marker exists
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {

                    matrix[i][j] = 0;
                }
            }

            // Handle column 0 separately
            if (col0 == 0) {

                matrix[i][0] = 0;
            }
        }
    }
}
