package LinkedList;

/**
 * This class provides a method to merge two sorted singly linked lists
 * into a single sorted linked list.
 */
public class Merge2SortedLists {

    /**
     * Merges two sorted linked lists into a single sorted list.
     *
     * @param list1 the head of the first sorted linked list
     * @param list2 the head of the second sorted linked list
     * @return the head of the merged sorted linked list
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode mover = dummy;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        // Merge nodes in sorted order
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                mover.next = temp1;
                temp1 = temp1.next;
            } else {
                mover.next = temp2;
                temp2 = temp2.next;
            }
            mover = mover.next;
        }

        // Append the remaining nodes
        if (temp1 != null) mover.next = temp1;
        else if (temp2 != null) mover.next = temp2;

        return dummy.next;
    }

    /**
     * Simple test for the mergeTwoLists method.
     */
    public static void main(String[] args) {
        // First sorted list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Second sorted list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Merge2SortedLists solution = new Merge2SortedLists();
        ListNode merged = solution.mergeTwoLists(list1, list2);

        // Print merged list
        System.out.print("Merged List: ");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        // Expected Output: 1 1 2 3 4 4
    }
}
