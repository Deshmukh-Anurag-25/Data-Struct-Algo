package LinkedList;

/**
 * This class provides a method to check whether a linked list is a palindrome.
 *
 * The algorithm works by:
 * 1. Finding the middle of the list using fast/slow pointers.
 * 2. Reversing the second half of the list.
 * 3. Comparing the first and second half node by node.
 */
public class PalindromeLinkedList {

    /**
     * Reverses a linked list.
     *
     * @param head the head of the linked list
     * @return the new head after reversal
     */
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    /**
     * Checks if a linked list is a palindrome.
     *
     * @param head the head of the linked list
     * @return true if the list is a palindrome, false otherwise
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode secondHalf = reverse(slow);

        // Step 3: Compare both halves
        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    /**
     * Main method to test the isPalindrome functionality.
     */
    public static void main(String[] args) {
        // Create test linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        PalindromeLinkedList solution = new PalindromeLinkedList();
        System.out.println("Is Palindrome: " + solution.isPalindrome(head)); // Expected: true
    }
}
