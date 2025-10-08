package LinkedList;

/**
 * This class detects if a linked list contains a cycle using Floyd's Cycle Detection Algorithm.
 */
public class LinkedListCycle {

    /**
     * Determines if a linked list has a cycle.
     *
     * @param head the head node of the linked list
     * @return true if there is a cycle, false otherwise
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        // Move slow by 1 and fast by 2 steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If they meet, there is a cycle
            if (slow == fast) return true;
        }

        return false; // No cycle found
    }

    /**
     * Simple test for hasCycle.
     */
    public static void main(String[] args) {
        // Example: 3 -> 2 -> 0 -> -4 -> (back to node 2)
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create cycle

        LinkedListCycle solution = new LinkedListCycle();
        System.out.println("Has Cycle: " + solution.hasCycle(head)); // Expected: true
    }
}
