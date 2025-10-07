package String;

/**
 * This class provides a method to find the longest common prefix
 * among an array of strings.
 *
 * The approach compares the prefix iteratively with each string
 * and shortens it until all strings share the same prefix.
 */
public class LongestCommonPrefix {

    /**
     * Finds the longest common prefix among an array of strings.
     *
     * @param strs an array of strings
     * @return the longest common prefix; returns an empty string if none exists
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    /**
     * Main method to test the longestCommonPrefix functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println("Test 1 (common prefix): " + solution.longestCommonPrefix(strs1));
        System.out.println("Test 2 (no common prefix): " + solution.longestCommonPrefix(strs2));
    }
}
