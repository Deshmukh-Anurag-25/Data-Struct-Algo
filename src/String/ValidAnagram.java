package String;

/**
 * This class provides a method to check whether two strings
 * are anagrams of each other.
 *
 * Two strings are anagrams if they contain the same characters
 * in the same frequency, but possibly in a different order.
 */
public class ValidAnagram {

    /**
     * Determines whether the given strings are anagrams.
     *
     * @param s the first input string
     * @param t the second input string
     * @return true if both strings are anagrams, otherwise false
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabets = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }

        for (int count : alphabets) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Main method to test the isAnagram functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";

        System.out.println("Test 1 (should be true): " + solution.isAnagram(s1, t1));
        System.out.println("Test 2 (should be false): " + solution.isAnagram(s2, t2));
    }
}
