package BinarySearch;

/**
 * This class provides a method to find the index at which a target should be inserted
 * into a sorted array. If the target is found, its index is returned.
 */
public class SearchInsertPosition {

    /**
     * Searches for the target value in the sorted array.
     * If not found, returns the index where it should be inserted to maintain order.
     *
     * @param nums   sorted array of integers
     * @param target value to search for
     * @return index of the target or appropriate insert position
     */
    public int searchInsert(int[] nums, int target) {
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

        return left; // Insert position
    }

    /**
     * Main method to test the searchInsert functionality.
     */
    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();

        int[] nums = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        System.out.println("Insert/Search Position of 5: " + solution.searchInsert(nums, target1)); // Expected: 2
        System.out.println("Insert/Search Position of 2: " + solution.searchInsert(nums, target2)); // Expected: 1
        System.out.println("Insert/Search Position of 7: " + solution.searchInsert(nums, target3)); // Expected: 4
    }
}
