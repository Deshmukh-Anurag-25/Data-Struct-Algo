package BinarySearch;

/**
 * This class provides a method to find the first bad version using binary search.
 * The assumption is that once a bad version is found, all following versions are also bad.
 */
public class FirstBadVersion /*extends VersionControl*/ {

    /**
     * Finds the first bad version in the given version history.
     *
     * @param n the total number of versions
     * @return the version number of the first bad version
     */
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow

            if (isBadVersion(mid)) {
                right = mid; // Mid might be the first bad version
            } else {
                left = mid + 1; // First bad version is after mid
            }
        }

        return left; // or return right; both point to first bad version
    }
    /**
     * Example test (Note: isBadVersion would be provided by the platform such as LeetCode).
     */
    public static void main(String[] args) {
        // This cannot be effectively tested locally unless you mock isBadVersion().
        // So this main method is just a placeholder.
        System.out.println("Use test cases from the platform where isBadVersion() is available.");
    }
}
