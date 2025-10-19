package Maths;

/**
 * This class provides a method to count the number of steps required
 * to reduce a number to zero using the following rules:
 *
 * - If the number is even, divide it by 2.
 * - If the number is odd, subtract 1.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class NumberOfStepsToReduceToZero {

    /**
     * Returns the number of steps to reduce the given number to zero.
     *
     * @param num the input number
     * @return number of steps required to reduce it to zero
     */
    public int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            step++;
        }
        return step;
    }

    /**
     * Main method to test the numberOfSteps functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        NumberOfStepsToReduceToZero solution = new NumberOfStepsToReduceToZero();

        System.out.println("Test 1 (14): " + solution.numberOfSteps(14)); // Output: 6
        System.out.println("Test 2 (8): " + solution.numberOfSteps(8));   // Output: 4
        System.out.println("Test 3 (123): " + solution.numberOfSteps(123)); // Output: 12
    }
}
