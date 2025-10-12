package BinarySearch;

/**
 * This class provides an implementation of binary search
 * to find the index of a target value in a sorted array.
 */
public class BinarySearch {

    /**
     * Searches for the target value in the sorted array using binary search.
     *
     * @param nums   sorted array of integers
     * @param target value to search for
     * @return index of the target if found, otherwise -1
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

    /**
     * Main method to test the binary search functionality.
     */
    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = solution.search(nums, target);
        System.out.println("Index of target: " + result); // Expected Output: 4
    }
}
