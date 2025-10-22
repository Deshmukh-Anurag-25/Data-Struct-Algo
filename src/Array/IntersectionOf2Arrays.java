package Array;

import java.util.Arrays;

/**
 * This class provides a method to find the intersection of two integer arrays.
 * Each element in the result must be unique and may appear in any order.
 *
 * This implementation uses a frequency array for O(n) performance,
 * assuming numbers are within the range [0, 1000].
 */
public class IntersectionOf2Arrays {

    /**
     * Returns the intersection of two arrays (unique elements only).
     *
     * @param nums1 first input array
     * @param nums2 second input array
     * @return an array containing the unique intersection elements
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int idx = 0;

        for (int num : nums1) {
            freq[num] = 1;
        }

        for (int num : nums2) {
            if (freq[num] == 1) {
                result[idx++] = num;
                freq[num] = 0; // avoid duplicates
            }
        }

        return Arrays.copyOfRange(result, 0, idx);
    }

    /**
     * Main method to test the intersection functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        IntersectionOf2Arrays solution = new IntersectionOf2Arrays();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println("Intersection: " + Arrays.toString(solution.intersection(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println("Intersection: " + Arrays.toString(solution.intersection(nums3, nums4)));
    }
}
