package Array;

/**
 * This class provides a method to rotate an array to the right
 * by a given number of steps using the reversal algorithm.
 */
public class RotateArray {

    /**
     * Reverses elements in the array between the given indices.
     *
     * @param nums the array to modify
     * @param left the starting index
     * @param right the ending index
     */
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Rotates the array to the right by k steps in-place.
     *
     * @param nums the array of integers to rotate
     * @param k the number of steps to rotate
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;  // Handle cases where k > n

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    /**
     * Main method to test the rotate functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        RotateArray solution = new RotateArray();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {-1, -100, 3, 99};

        solution.rotate(nums1, 3);
        solution.rotate(nums2, 2);

        System.out.print("Test 1 (rotated by 3): ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Test 2 (rotated by 2): ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}
