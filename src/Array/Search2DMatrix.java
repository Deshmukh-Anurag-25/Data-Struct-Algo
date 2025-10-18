package Array;

/**
 * This class provides a method to search for a target value
 * in a 2D matrix where:
 * 1. Each row is sorted in ascending order.
 * 2. The first integer of each row is greater than the last integer of the previous row.
 *
 * The matrix is treated as a flattened sorted 1D array,
 * and Binary Search is applied over it.
 */
public class Search2DMatrix {

    /**
     * Searches for a target value in a sorted 2D matrix.
     *
     * @param matrix the 2D matrix of integers
     * @param target the value to search for
     * @return true if the target exists in the matrix, otherwise false
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0, right = (rows * cols) - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
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
        Search2DMatrix solution = new Search2DMatrix();

        int[][] matrix1 = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int[][] matrix2 = {
                {1}
        };

        System.out.println("Test 1 (Target = 3): " + solution.searchMatrix(matrix1, 3));   // true
        System.out.println("Test 2 (Target = 13): " + solution.searchMatrix(matrix1, 13)); // false
        System.out.println("Test 3 (Target = 1): " + solution.searchMatrix(matrix2, 1));   // true
        System.out.println("Test 4 (Target = 2): " + solution.searchMatrix(matrix2, 2));   // false
    }
}
