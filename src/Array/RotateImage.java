package Array;

import java.util.Arrays;

/**
 * This class provides a method to rotate an n x n matrix by 90 degrees clockwise.
 * The rotation is done in-place using two steps:
 * 1. Transpose the matrix.
 * 2. Reverse each row.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
public class RotateImage {

    /**
     * Transposes the given square matrix in-place.
     *
     * @param matrix the input n x n matrix
     */
    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /**
     * Reverses each row of the matrix in-place.
     *
     * @param matrix the input n x n matrix
     */
    private void reverseRows(int[][] matrix) {
        for (int[] row : matrix) {
            int left = 0, right = row.length - 1;
            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            }
        }
    }

    /**
     * Rotates the given matrix by 90 degrees clockwise in-place.
     *
     * @param matrix the input n x n matrix
     */
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
    }

    /**
     * Main method to test the rotate functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        RotateImage solution = new RotateImage();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) System.out.println(Arrays.toString(row));

        solution.rotate(matrix);

        System.out.println("\nRotated Matrix (90° Clockwise):");
        for (int[] row : matrix) System.out.println(Arrays.toString(row));
    }
}
