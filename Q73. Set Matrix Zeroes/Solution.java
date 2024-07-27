class Solution {
    public void setZeroes(int[][] matrix) {
      final int rows = matrix.length;
      final int cols = matrix[0].length;
      boolean fillFirstRow = false;
      boolean fillFirstColumn = false;
  
      for (int j = 0; j < cols; ++j)
        if (matrix[0][j] == 0) {
          fillFirstRow = true;
          break;
        }
  
      for (int i = 0; i < rows; ++i)
        if (matrix[i][0] == 0) {
          fillFirstColumn = true;
          break;
        }
  
      // Store the information in the first row and the first column.
      for (int i = 1; i < rows; ++i)
        for (int j = 1; j < cols; ++j)
          if (matrix[i][j] == 0) {
            matrix[i][0] = 0;
            matrix[0][j] = 0;
          }
  
      // Fill 0s for the matrix except the first row and the first column.
      for (int i = 1; i < rows; ++i)
        for (int j = 1; j < cols; ++j)
          if (matrix[i][0] == 0 || matrix[0][j] == 0)
            matrix[i][j] = 0;
  
      // Fill 0s for the first row if needed.
      if (fillFirstRow)
        for (int j = 0; j < cols; ++j)
          matrix[0][j] = 0;
  
      // Fill 0s for the first column if needed.
      if (fillFirstColumn)
        for (int i = 0; i < rows; ++i)
          matrix[i][0] = 0;
    }
  }
  