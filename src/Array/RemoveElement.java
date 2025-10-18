package Array;

/**
 * This class provides a method to remove all occurrences of a specified value
 * from an integer array in-place and return the new length of the modified array.
 *
 * The relative order of the elements may be changed, but elements up to the returned
 * length are guaranteed to be free of the specified value.
 */
public class RemoveElement {

    /**
     * Removes all instances of {@code val} from the array {@code nums} in-place.
     *
     * @param nums the input array of integers
     * @param val  the value to be removed
     * @return the number of elements remaining after removal
     */
    public int removeElement(int[] nums, int val) {
        int j = 0; // Pointer for the next position to store a valid element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    /**
     * Main method to demonstrate functionality.
     */
    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;

        int newLength = solution.removeElement(nums, val);

        System.out.println("New length after removing " + val + ": " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
