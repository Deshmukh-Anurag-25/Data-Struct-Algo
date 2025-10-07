package Array;

import java.util.Arrays;

/**
 * This class provides a method to find the intersection of two arrays,
 * where each element in the result should appear as many times as it shows
 * in both arrays.
 */
public class IntersectionOf2ArraysII {

    /**
     * Finds the intersection of two arrays, including duplicate elements.
     *
     * @param nums1 the first array of integers
     * @param nums2 the second array of integers
     * @return an array representing the intersection of nums1 and nums2
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001]; // Frequency array for counting elements in nums1
        for (int num : nums1) {
            freq[num]++;
        }

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int num : nums2) {
            if (freq[num] > 0) {
                freq[num]--;
                result[k++] = num;
            }
        }

        return Arrays.copyOfRange(result, 0, k);
    }

    /**
     * Main method to test the intersect functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        IntersectionOf2ArraysII solution = new IntersectionOf2ArraysII();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = solution.intersect(nums1, nums2);

        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
