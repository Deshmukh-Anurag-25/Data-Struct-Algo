package Array;

/**
 * This class provides a method to search for a target value
 * in a 2D matrix where:
 *
 * 1. Integers in each row are sorted in ascending order.
 * 2. Integers in each column are also sorted in ascending order.
 *
 * The search starts from the top-right corner of the matrix.
 * If the current value is greater than the target, move left.
 * If the current value is smaller than the target, move down.
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */
public class Search2DMatrixII {

    /**
     * Searches for a target value in a 2D matrix.
     *
     * @param matrix the sorted 2D matrix of integers
     * @param target the value to search for
     * @return true if the target exists in the matrix, otherwise false
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            int num = matrix[row][col];

            if (num == target) {
                return true;
            } else if (num < target) {
                row++; // Move down
            } else {
                col--; // Move left
            }
        }

        return false;
    }

    /**
     * Main method to test the searchMatrix functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Search2DMatrixII solution = new Search2DMatrixII();

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println("Test 1 (Target = 5): " + solution.searchMatrix(matrix, 5));  // true
        System.out.println("Test 2 (Target = 20): " + solution.searchMatrix(matrix, 20)); // false
    }
}
