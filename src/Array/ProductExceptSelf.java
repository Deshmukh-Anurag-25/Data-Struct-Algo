package Array;

/**
 * This class provides a method to return an array such that each element
 * at index i is the product of all elements in the array except nums[i],
 * without using division.
 */
public class ProductExceptSelf {

    /**
     * Returns an array where each element is the product of all
     * other elements in the input array, except itself.
     *
     * This is achieved using prefix and suffix products in O(n) time
     * and O(1) extra space (excluding the output array).
     *
     * @param nums the input array of integers
     * @return an array of products where each element is the product of all others
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 1;

        // Compute prefix products
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Compute suffix products and combine with prefix
        int suffix = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            prefix[i] *= suffix;
        }

        return prefix;
    }

    /**
     * Main method to test the productExceptSelf functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};

        int[] result1 = solution.productExceptSelf(nums1);
        int[] result2 = solution.productExceptSelf(nums2);

        System.out.print("Test 1 (products): ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Test 2 (products): ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
