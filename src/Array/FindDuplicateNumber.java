package Array;

/**
 * This class provides a method to find the duplicate number
 * in an array of integers where:
 *
 * 1. The array contains n + 1 integers.
 * 2. Each integer is between 1 and n (inclusive).
 * 3. There is only one repeated number, but it may appear multiple times.
 *
 * The algorithm uses Floyd's Tortoise and Hare (Cycle Detection) technique
 * to detect the duplicate number without modifying the array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class FindDuplicateNumber {

    /**
     * Finds the duplicate number in the given array.
     *
     * @param nums the input array containing one duplicate
     * @return the duplicate number
     */
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;

        // Phase 1: Detect intersection point of the two runners.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle.
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    /**
     * Main method to test the findDuplicate functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        FindDuplicateNumber solution = new FindDuplicateNumber();

        int[] nums = {1, 3, 4, 2, 2};

        System.out.println("Duplicate Number: " + solution.findDuplicate(nums)); // Output: 2
    }
}
