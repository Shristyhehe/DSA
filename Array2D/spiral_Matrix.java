/*Time Complexity : O(M × N)
Space Complexity: O(1)*/


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> spiral = new ArrayList<>();
     int topRow=0;
     int bottomRow = matrix.length-1;
     int rightColumn = matrix[0].length-1;
     int leftColumn = 0;
      
      // Keep traversing while at least one row and one column remain.
      
     while(topRow <= bottomRow && leftColumn <= rightColumn){

       
    // Traverse the current top row from left to right.
    // We are printing the entire top boundary.
       
        for(int j=leftColumn; j<=rightColumn; j++){
            spiral.add(matrix[topRow][j]);
        }
           // Top row has been printed, so move to the next row.
        topRow++;

       // Traverse the current right column from top to bottom.
    // We are printing the entire right boundary.
       
        for(int j=topRow; j<=bottomRow; j++){
            spiral.add(matrix[j][rightColumn]);
        }
        // Right column has been printed, so move one column left.
      
        rightColumn--;

        // Is there still at least one row left that hasn't been printed?
       
        if(topRow <= bottomRow){
          
            // Traverse the current bottom row from right to left.
          
            for(int j=rightColumn; j>=leftColumn; j--){
        spiral.add(matrix[bottomRow][j]);
     }
        }
   // Bottom row has been printed, so move one row up. 
     bottomRow--;
 // Is there still at least one column left that hasn't been printed?
       
     if(leftColumn<= rightColumn){
        // Traverse the current left column from bottom to top.
                 for(int j=bottomRow; j>=topRow; j--){
        spiral.add(matrix[j][leftColumn]);
     }
     }
     // Left column has been printed, so move one column right.
     leftColumn++;
     }
     return spiral;
    }
}
