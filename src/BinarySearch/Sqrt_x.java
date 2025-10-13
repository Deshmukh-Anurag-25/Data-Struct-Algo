package BinarySearch;

/**
 * This class implements the integer square root function using Binary Search.
 *
 * The function returns the floor of the square root of a non-negative integer x.
 * For example:
 * - sqrt(4) = 2
 * - sqrt(8) = 2 (since 2^2 = 4 <= 8 and 3^2 = 9 > 8)
 */
public class Sqrt_x {

    /**
     * Computes the integer square root of x using Binary Search.
     *
     * @param x the non-negative integer
     * @return the floor value of sqrt(x)
     */
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x; // Handle small cases directly

        int left = 1, right = x;
        int mid;
        long square;

        while (left <= right) {
            mid = left + (right - left) / 2; // Avoid overflow
            square = (long) mid * mid;

            if (square == x) {
                return mid; // Perfect square
            } else if (square < x) {
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }

        // At this point, right is the floor of sqrt(x)
        return right;
    }

    /**
     * Main method for quick testing.
     */
    public static void main(String[] args) {
        Sqrt_x solution = new Sqrt_x();

        System.out.println("sqrt(4) = " + solution.mySqrt(4));   // Expected: 2
        System.out.println("sqrt(8) = " + solution.mySqrt(8));   // Expected: 2
        System.out.println("sqrt(16) = " + solution.mySqrt(16)); // Expected: 4
        System.out.println("sqrt(1) = " + solution.mySqrt(1));   // Expected: 1
        System.out.println("sqrt(0) = " + solution.mySqrt(0));   // Expected: 0
    }
}
