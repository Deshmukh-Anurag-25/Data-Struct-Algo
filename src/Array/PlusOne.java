package Array;

/**
 * This class provides a method to increment a large integer
 * represented as an array of digits.
 */
public class PlusOne {

    /**
     * Adds one to the integer represented by the array of digits.
     * Handles carry-over and array expansion if necessary.
     *
     * @param digits the array of digits representing a non-negative integer
     * @return a new or modified array representing the incremented number
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    /**
     * Main method to test the plusOne functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        PlusOne solution = new PlusOne();

        int[] digits = {9, 9, 9};
        int[] result = solution.plusOne(digits);

        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
