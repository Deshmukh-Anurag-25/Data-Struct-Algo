package LinkedList;

/**
 * This class provides a method to find the middle node of a singly linked list.
 */
public class MiddleOfLinkedList {

    /**
     * Finds the middle node of the linked list.
     * If there are two middle nodes, returns the second one.
     *
     * @param head the head node of the linked list
     * @return the middle node
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast twice as quickly as slow
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow; // slow points to the middle node
    }

    /**
     * Simple test for the middleNode method.
     */
    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleOfLinkedList solution = new MiddleOfLinkedList();
        ListNode middle = solution.middleNode(head);

        System.out.println("Middle Node Value: " + middle.val); // Expected: 3
    }
}
