package BinarySearch;

/**
 * This class provides methods to find the first and last occurrence
 * of a target value in a sorted array using binary search.
 */
public class FirstAndLastPosition {

    /**
     * Searches for the first (leftmost) occurrence of the target.
     *
     * @param nums sorted array of integers
     * @param target value to search for
     * @return index of the first occurrence, or -1 if not found
     */
    private int searchLeft(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                right = mid - 1; // Keep searching on the left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }

    /**
     * Searches for the last (rightmost) occurrence of the target.
     *
     * @param nums sorted array of integers
     * @param target value to search for
     * @return index of the last occurrence, or -1 if not found
     */
    private int searchRight(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                left = mid + 1; // Keep searching on the right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }

    /**
     * Returns the starting and ending position of a given target in a sorted array.
     *
     * @param nums sorted array of integers
     * @param target value to search for
     * @return array of two integers {start, end}, or {-1, -1} if not found
     */
    public int[] searchRange(int[] nums, int target) {
        return new int[]{searchLeft(nums, target), searchRight(nums, target)};
    }

    /**
     * Main method to test the searchRange functionality.
     */
    public static void main(String[] args) {
        FirstAndLastPosition solution = new FirstAndLastPosition();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = solution.searchRange(nums, target);
        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
        // Expected Output: [3, 4]
    }
}

