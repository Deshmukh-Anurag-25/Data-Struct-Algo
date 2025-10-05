package Array;

import java.util.HashSet;

/**
 * This class provides a method to check whether an array
 * contains any duplicate integers.
 */
public class ContainsDuplicates {

    /**
     * Checks if any value appears at least twice in the array.
     *
     * @param nums the array of integers to check
     * @return true if a duplicate is found, otherwise false
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    /**
     * Main method to test the containsDuplicate functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ContainsDuplicates solution = new ContainsDuplicates();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println("Test 1 (no duplicates): " + solution.containsDuplicate(nums1));
        System.out.println("Test 2 (has duplicates): " + solution.containsDuplicate(nums2));
    }
}
