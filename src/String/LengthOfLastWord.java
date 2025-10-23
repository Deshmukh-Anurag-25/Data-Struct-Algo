package String;

/**
 * This class provides a method to find the length of the last word
 * in a given string. A word is defined as a maximal substring
 * consisting of non-space characters only.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LengthOfLastWord {

    /**
     * Returns the length of the last word in the given string.
     *
     * @param s the input string
     * @return the length of the last word
     */
    public int lengthOfLastWord(String s) {
        int len = 0;
        int j = s.length() - 1;

        // Skip trailing spaces
        while (j >= 0 && s.charAt(j) == ' ') {
            j--;
        }

        // Count characters of the last word
        while (j >= 0 && s.charAt(j) != ' ') {
            len++;
            j--;
        }

        return len;
    }

    /**
     * Main method to test the lengthOfLastWord functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        System.out.println("Test 1: " + solution.lengthOfLastWord("Hello World"));        // 5
        System.out.println("Test 2: " + solution.lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println("Test 3: " + solution.lengthOfLastWord("luffy is still joyboy")); // 6
    }
}
