package BitManipulation;

/**
 * This class provides a method to find the single non-duplicated element
 * in an array where every other element appears exactly twice.
 *
 * The solution uses XOR operation, since:
 *   - a ^ a = 0
 *   - a ^ 0 = a
 *   - XOR is commutative and associative
 *
 * Therefore, XOR'ing all numbers leaves only the unique number.
 */
public class SingleElement {

    /**
     * Finds the element that appears only once in the array.
     *
     * @param nums the input array where every element appears twice except one
     * @return the single non-repeating element
     */
    public int singleNumber(int[] nums) {
        int xorr = 0; // Starting with 0 makes logic cleaner
        for (int num : nums) {
            xorr ^= num;
        }
        return xorr;
    }

    /**
     * Main method for demonstrating the functionality.
     */
    public static void main(String[] args) {
        SingleElement solution = new SingleElement();

        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single Element: " + solution.singleNumber(nums)); // Output: 4
    }
}
