package String;

/**
 * This class provides a method to check whether a given string
 * is a palindrome, considering only alphanumeric characters
 * and ignoring cases.
 */
public class ValidPalindrome {

    /**
     * Determines whether the input string is a palindrome.
     *
     * @param s the input string
     * @return true if the string is a palindrome, otherwise false
     */
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    /**
     * Main method to test the isPalindrome functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "";

        System.out.println("Test 1 (should be true): " + solution.isPalindrome(test1));
        System.out.println("Test 2 (should be false): " + solution.isPalindrome(test2));
        System.out.println("Test 3 (should be true): " + solution.isPalindrome(test3));
    }
}
