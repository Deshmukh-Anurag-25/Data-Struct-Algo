package String;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This class provides a method to validate if a string containing
 * parentheses, brackets, and braces is correctly balanced.
 *
 * Uses a stack-based approach to ensure each opening symbol
 * has a corresponding and correctly ordered closing symbol.
 */
public class ValidParentheses {

    /**
     * Checks if the given string of parentheses is valid.
     *
     * @param s input string containing only '(', ')', '{', '}', '[' and ']'
     * @return true if the string is valid, false otherwise
     */
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                default:
                    return false; // Invalid character encountered
            }
        }

        return stack.isEmpty();
    }

    /**
     * Main method to test the isValid() functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();

        System.out.println("Test 1: " + vp.isValid("()"));       // true
        System.out.println("Test 2: " + vp.isValid("()[]{}"));   // true
        System.out.println("Test 3: " + vp.isValid("(]"));       // false
        System.out.println("Test 4: " + vp.isValid("([{}])"));   // true
        System.out.println("Test 5: " + vp.isValid("([)]"));     // false
    }
}
