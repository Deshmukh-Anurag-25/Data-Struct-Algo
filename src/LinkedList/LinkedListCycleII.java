package LinkedList;

/**
 * This class provides a method to detect the starting node of a cycle
 * in a linked list using Floyd's Tortoise and Hare algorithm.
 *
 * The approach first identifies whether a cycle exists. If a cycle is found,
 * one pointer is reset to the head of the list and both pointers move at the
 * same speed until they meet — the meeting point is the start of the cycle.
 */
public class LinkedListCycleII {

    /**
     * Detects the node where the cycle begins in a linked list.
     * If no cycle exists, returns null.
     *
     * @param head the head of the linked list
     * @return the node where the cycle begins, or null if no cycle is found
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow by 1
            fast = fast.next.next;    // Move fast by 2

            // Cycle detected
            if (slow == fast) {
                // Phase 2: Find the cycle start
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Start of the cycle
            }
        }

        return null; // No cycle
    }

    /**
     * Main method to test the detectCycle functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Create nodes
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeMinus4 = new ListNode(-4);

        // Build a list: 3 -> 2 -> 0 -> -4
        head.next = node2;
        node2.next = node0;
        node0.next = nodeMinus4;

        // Create a cycle: -4 -> 2
        nodeMinus4.next = node2;

        LinkedListCycleII solution = new LinkedListCycleII();
        ListNode cycleStart = solution.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle detected at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
