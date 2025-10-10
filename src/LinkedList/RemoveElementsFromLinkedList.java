package LinkedList;

/**
 * This class provides a method to remove all nodes from a linked list
 * that contain a specified value.
 */
public class RemoveElementsFromLinkedList {

    /**
     * Removes all nodes from the linked list that have the given value.
     *
     * @param head the head of the linked list
     * @param val the value to remove from the list
     * @return the head of the modified linked list
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
        ListNode mover = dummy;
        ListNode temp = head;

        while (temp != null) {
            if (temp.val != val) {
                mover.next = temp;
                mover = mover.next;
            }
            temp = temp.next;
        }

        mover.next = null; // Ensure the last node doesn't point to removed elements
        return dummy.next;
    }

    /**
     * Main method to test the removeElements functionality.
     */
    public static void main(String[] args) {
        // Example: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6, val = 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        RemoveElementsFromLinkedList solution = new RemoveElementsFromLinkedList();
        ListNode newHead = solution.removeElements(head, 6);

        System.out.print("List after removal: ");
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        // Expected Output: 1 2 3 4 5
    }
}
