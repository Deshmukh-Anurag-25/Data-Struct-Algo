package Array;

import java.util.HashMap;

/**
 * Provides a method to find two indices in an array such that
 * the numbers at those indices add up to a specific target.
 */
public class TwoSum {

    /**
     * Returns the indices of the two numbers in the array that add up to the target.
     * If no such pair exists, returns {-1, -1}.
     *
     * @param nums   the array of integers
     * @param target the target sum
     * @return an array containing the indices of the two numbers
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int moreNeeded = target - nums[i];
            if (map.containsKey(moreNeeded)) {
                return new int[]{map.get(moreNeeded), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    /**
     * Main method for testing the twoSum functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
