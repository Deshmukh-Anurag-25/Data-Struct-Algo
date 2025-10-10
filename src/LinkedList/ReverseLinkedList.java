package LinkedList;

/**
 * This class provides a method to reverse a singly linked list.
 */
public class ReverseLinkedList {

    /**
     * Reverses the given singly linked list.
     *
     * @param head the head of the linked list to reverse
     * @return the new head of the reversed linked list
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode;

        while (current != null) {
            nextNode = current.next;  // Temporarily store the next node
            current.next = prev;      // Reverse the pointer
            prev = current;           // Move prev one step forward
            current = nextNode;       // Move current one step forward
        }

        return prev; // New head of the reversed list
    }

    /**
     * Main method to test the reverseList functionality.
     */
    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode reversed = solution.reverseList(head);

        System.out.print("Reversed List: ");
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
        // Expected Output: 5 4 3 2 1
    }
}
