package String;

/**
 * This class finds the index of the first non-repeating character in a string.
 * If all characters repeat, it returns -1.
 */
public class FirstUniqueCharacter {

    /**
     * Returns the index of the first unique (non-repeating) character in the string.
     *
     * @param s the input string containing only lowercase letters
     * @return the index of the first unique character, or -1 if none exist
     */
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Main method to test the firstUniqChar method.
     */
    public static void main(String[] args) {
        FirstUniqueCharacter solution = new FirstUniqueCharacter();

        String s = "leetcode";
        int index = solution.firstUniqChar(s);

        System.out.println("Input: " + s);
        System.out.println("First unique character index: " + index);
    }
}
