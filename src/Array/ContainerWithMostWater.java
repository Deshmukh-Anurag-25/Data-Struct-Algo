package Array;

/**
 * This class provides a method to find the maximum amount of water
 * that can be contained between two vertical lines using the two-pointer approach.
 */
public class ContainerWithMostWater {

    /**
     * Computes the maximum water that can be contained between two lines.
     * Each element in the array represents the height of a line.
     *
     * @param height an array of non-negative integers representing line heights
     * @return the maximum area of water that can be contained
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * width;
            maxWater = Math.max(maxWater, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    /**
     * Main method to test the maxArea functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};

        System.out.println("Test 1 (max water): " + solution.maxArea(height1));
        System.out.println("Test 2 (max water): " + solution.maxArea(height2));
    }
}
