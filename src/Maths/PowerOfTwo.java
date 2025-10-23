package Maths;

/**
 * This class provides a method to determine whether a given integer
 * is a power of two.
 *
 * A number is a power of two if it can be represented as 2^k,
 * where k is a non-negative integer.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class PowerOfTwo {

    /**
     * Checks whether the given number is a power of two.
     *
     * @param n the input integer
     * @return true if n is a power of two, otherwise false
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }

    /**
     * Main method to test the isPowerOfTwo functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        PowerOfTwo solution = new PowerOfTwo();

        System.out.println("Test 1 (n = 1): " + solution.isPowerOfTwo(1));   // true
        System.out.println("Test 2 (n = 16): " + solution.isPowerOfTwo(16)); // true
        System.out.println("Test 3 (n = 3): " + solution.isPowerOfTwo(3));   // false
        System.out.println("Test 4 (n = 0): " + solution.isPowerOfTwo(0));   // false
        System.out.println("Test 5 (n = 1024): " + solution.isPowerOfTwo(1024)); // true
    }
}
