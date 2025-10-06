package Array;

/**
 * This class provides a method to merge two sorted arrays
 * into one sorted array in-place.
 */
public class MergeSortedArray {

    /**
     * Merges nums2 into nums1 as one sorted array.
     * Assumes nums1 has enough trailing space to hold additional elements.
     *
     * @param nums1 the first sorted array with extra space at the end
     * @param m the number of valid elements in nums1
     * @param nums2 the second sorted array
     * @param n the number of valid elements in nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements of nums2 (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    /**
     * Main method to test the merge functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
