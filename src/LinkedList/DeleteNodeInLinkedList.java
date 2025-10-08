package LinkedList;

/**
 * This class provides a method to delete a node in a singly linked list,
 * given only access to that node (not the head of the list).
 *
 * The approach copies the value from the next node into the current node
 * and skips over the next node.
 */
public class DeleteNodeInLinkedList {

    /**
     * Definition for singly-linked list node.
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * Deletes the given node from the linked list.
     * The given node is guaranteed not to be the last node.
     *
     * @param node the node to be deleted
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * Main method to test the deleteNode functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        DeleteNodeInLinkedList solution = new DeleteNodeInLinkedList();

        // Constructing a linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        // Delete node with value 5
        solution.deleteNode(head.next);

        // Print resulting list: expected 4 -> 1 -> 9
        System.out.print("Updated Linked List: ");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
