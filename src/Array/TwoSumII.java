package Array;

/**
 * This class provides a solution to the "Two Sum II" problem,
 * where the input array is sorted in non-decreasing order.
 *
 * The goal is to find two numbers such that they add up to a specific target,
 * and return their 1-based indices.
 *
 * This implementation uses the two-pointer technique with O(n) time complexity.
 */
public class TwoSumII {

    /**
     * Finds two numbers in a sorted array that add up to the target.
     *
     * @param numbers the sorted input array
     * @param target  the target sum
     * @return an array containing the 1-based indices of the two numbers, or {-1, -1} if not found
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // Should not happen as per problem constraints
    }

    /**
     * Main method to test the twoSum functionality.
     */
    public static void main(String[] args) {
        TwoSumII solution = new TwoSumII();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: 1, 2
    }
}
