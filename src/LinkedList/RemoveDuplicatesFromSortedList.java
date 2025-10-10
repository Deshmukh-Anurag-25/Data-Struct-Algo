package LinkedList;

/**
 * This class provides a method to remove duplicates from a sorted singly linked list.
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * Removes duplicate nodes from a sorted linked list.
     *
     * @param head the head of the sorted linked list
     * @return the modified list with duplicates removed
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode mover = head;
        ListNode temp = head.next;

        while (temp != null) {
            if (temp.val != mover.val) {
                mover.next = temp;
                mover = mover.next;
            }
            temp = temp.next;
        }
        mover.next = null; // Disconnect any remaining duplicate nodes

        return head;
    }

    /**
     * Main method to test the deleteDuplicates functionality.
     */
    public static void main(String[] args) {
        // Example: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        ListNode newHead = solution.deleteDuplicates(head);

        System.out.print("List after removing duplicates: ");
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        // Expected Output: 1 2 3
    }
}
