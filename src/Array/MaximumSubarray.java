package Array;

/**
 * This class provides a method to find the maximum sum
 * of a contiguous subarray using Kadane's Algorithm.
 */
public class MaximumSubarray {

    /**
     * Computes the maximum subarray sum.
     *
     * @param nums the array of integers
     * @return the largest possible sum of a contiguous subarray
     */
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    /**
     * Main method to test the maxSubArray functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println("Test 1 (max subarray sum): " + solution.maxSubArray(nums1));
        System.out.println("Test 2 (max subarray sum): " + solution.maxSubArray(nums2));
        System.out.println("Test 3 (max subarray sum): " + solution.maxSubArray(nums3));
    }
}
