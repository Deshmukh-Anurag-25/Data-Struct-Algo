package Maths;

/**
 * This class provides a method to determine whether a given integer
 * is a palindrome without converting it to a string.
 *
 * A number is considered a palindrome if it reads the same forward and backward.
 */
public class PalindromeNumber {

    /**
     * Checks if a given integer is a palindrome.
     *
     * @param x the integer to check
     * @return true if the number is a palindrome, false otherwise
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return reversed == original;
    }

    /**
     * Main method to test the isPalindrome functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();

        System.out.println("Test 1 (121): " + solution.isPalindrome(121));   // true
        System.out.println("Test 2 (-121): " + solution.isPalindrome(-121)); // false
        System.out.println("Test 3 (10): " + solution.isPalindrome(10));     // false
        System.out.println("Test 4 (1331): " + solution.isPalindrome(1331)); // true
    }
}
