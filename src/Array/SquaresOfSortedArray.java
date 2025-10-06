package Array;

/**
 * This class provides a method to return a new array
 * containing the squares of each number from the input array,
 * sorted in non-decreasing order.
 */
public class SquaresOfSortedArray {

    /**
     * Returns a sorted array of squares from a sorted input array.
     *
     * @param nums a sorted array of integers (may include negatives)
     * @return a new array with sorted squares of each element
     */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0, j = n - 1, k = n - 1;

        while (i <= j) {
            if (Math.abs(nums[i]) <= Math.abs(nums[j])) {
                result[k--] = nums[j] * nums[j];
                j--;
            } else {
                result[k--] = nums[i] * nums[i];
                i++;
            }
        }

        return result;
    }

    /**
     * Main method to test the sortedSquares functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SquaresOfSortedArray solution = new SquaresOfSortedArray();

        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] nums2 = {-7, -3, 2, 3, 11};

        int[] result1 = solution.sortedSquares(nums1);
        int[] result2 = solution.sortedSquares(nums2);

        System.out.print("Test 1 (sorted squares): ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Test 2 (sorted squares): ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
