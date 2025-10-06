package Array;

/**
 * This class provides a method to remove duplicates
 * from a sorted integer array in-place.
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * Removes duplicates from a sorted array in-place and returns
     * the number of unique elements. The first part of the array
     * will contain those unique elements in order.
     *
     * @param nums the sorted array of integers
     * @return the count of unique elements
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    /**
     * Main method to test the removeDuplicates functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int len1 = solution.removeDuplicates(nums1);
        int len2 = solution.removeDuplicates(nums2);

        System.out.print("Test 1 (unique count " + len1 + "): ");
        for (int i = 0; i < len1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        System.out.print("Test 2 (unique count " + len2 + "): ");
        for (int i = 0; i < len2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
