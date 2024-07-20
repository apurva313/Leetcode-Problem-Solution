class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int r = matrix.length, c = matrix[0].length;
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements = 0;

        while (totalElements < r * c) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                result.add(matrix[topRow][j]);
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to BottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                result.add(matrix[i][rightCol]);
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                result.add(matrix[bottomRow][j]);
                totalElements++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                result.add(matrix[i][leftCol]);
                totalElements++;
            }
            leftCol++;
        }
        
        return result;
    }
}