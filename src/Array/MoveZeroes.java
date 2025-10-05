package Array;

/**
 * This class provides a method to move all zeroes in an integer array
 * to the end while preserving the order of non-zero elements.
 */
public class MoveZeroes {

    /**
     * Moves all zeros in the given array to the end while keeping
     * the relative order of non-zero elements.
     *
     * @param nums the array of integers to modify in place
     */
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        while (j < nums.length) {
            nums[j++] = 0;
        }
    }

    /**
     * Main method to test the moveZeroes functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};

        solution.moveZeroes(nums);

        System.out.print("Result: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
