package Array;

/**
 * This class provides a method to find the single non-duplicate element
 * in a sorted array where every other element appears exactly twice.
 *
 * The solution uses a binary search approach to achieve O(log n) time
 * and O(1) space complexity.
 */
public class SingleElementInSortedArray {

    /**
     * Finds the single non-duplicate element in a sorted array.
     *
     * @param nums a sorted array of integers where every element appears twice except one
     * @return the single non-duplicate element
     */
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1, high = n - 2;

        // Handle edge cases
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        // Binary search
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            boolean isEvenIndexAligned = (mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                    (mid % 2 == 1 && nums[mid] == nums[mid - 1]);

            if (isEvenIndexAligned) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return nums[low];
    }

    /**
     * Main method to test the singleNonDuplicate functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SingleElementInSortedArray solution = new SingleElementInSortedArray();

        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};

        System.out.println("Test 1 (Single Element): " + solution.singleNonDuplicate(nums1)); // Output: 2
        System.out.println("Test 2 (Single Element): " + solution.singleNonDuplicate(nums2)); // Output: 10
    }
}
