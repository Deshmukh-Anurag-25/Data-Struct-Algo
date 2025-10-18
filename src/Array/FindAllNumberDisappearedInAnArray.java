package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to find all numbers that are missing
 * from an array containing integers in the range [1, n], where n is
 * the size of the array.
 *
 * The approach marks visited indices by negating the number at the
 * corresponding index. After processing, the indices that remain
 * positive indicate missing numbers.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (excluding the output list)
 */
public class FindAllNumberDisappearedInAnArray {

    /**
     * Finds all numbers that are missing from the array.
     *
     * @param nums the input array containing values from 1 to n
     * @return a list of missing numbers
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx]; // Mark as visited
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { // Positive means not visited
                result.add(i + 1);
            }
        }

        return result;
    }

    /**
     * Main method to test the findDisappearedNumbers functionality.
     */
    public static void main(String[] args) {
        FindAllNumberDisappearedInAnArray solution = new FindAllNumberDisappearedInAnArray();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> missingNumbers = solution.findDisappearedNumbers(nums);
        System.out.println("Missing Numbers: " + missingNumbers); // Output: [5, 6]
    }
}
