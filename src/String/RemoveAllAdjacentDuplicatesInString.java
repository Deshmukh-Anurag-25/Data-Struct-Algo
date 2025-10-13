package string;

/**
 * This class provides an optimized method to remove all adjacent
 * duplicate characters from a string using a character stack.
 *
 * The approach utilizes an in-place char array as a stack, which
 * results in faster performance and lower memory usage compared
 * to using dynamic collections like ArrayList.
 */
public class RemoveAllAdjacentDuplicatesInString {

    /**
     * Removes all adjacent duplicates from the input string using
     * a stack-based approach with a character array.
     *
     * @param s the input string
     * @return the string after removing all adjacent duplicates
     */
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (top >= 0 && stack[top] == c) {
                top--; // Pop duplicate
            } else {
                stack[++top] = c; // Push character
            }
        }

        return new String(stack, 0, top + 1);
    }

    /**
     * Main method to test the removeDuplicates functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        string.RemoveAllAdjacentDuplicatesInString solution = new string.RemoveAllAdjacentDuplicatesInString();

        String test1 = "abbaca"; // Expected: "ca"
        String test2 = "azxxzy"; // Expected: "ay"

        System.out.println("Test 1: " + solution.removeDuplicates(test1));
        System.out.println("Test 2: " + solution.removeDuplicates(test2));
    }
}
