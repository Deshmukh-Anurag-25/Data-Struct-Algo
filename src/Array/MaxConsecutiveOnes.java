package Array;

/**
 * This class provides a method to find the maximum number of
 * consecutive 1s in a binary array.
 */
public class MaxConsecutiveOnes {

    /**
     * Returns the length of the longest subarray containing only 1s.
     *
     * @param nums the binary array (containing only 0s and 1s)
     * @return the maximum number of consecutive 1s
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    /**
     * Main method to test the findMaxConsecutiveOnes functionality.
     */
    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {0, 0, 1, 0, 1, 1, 1, 1};

        System.out.println("Max consecutive 1s (Test 1): " + solution.findMaxConsecutiveOnes(nums1)); // Expected: 3
        System.out.println("Max consecutive 1s (Test 2): " + solution.findMaxConsecutiveOnes(nums2)); // Expected: 4
    }
}
