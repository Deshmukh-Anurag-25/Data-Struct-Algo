package LinkedList;

/**
 * This class provides a method to find the intersection node of
 * two singly linked lists, if it exists.
 *
 * The approach uses two pointers and ensures they traverse
 * the same total distance, meeting at the intersection node.
 */
public class IntersectionOf2LinkedLists {

    /**
     * Finds the intersection node of two linked lists.
     *
     * @param headA the head of the first linked list
     * @param headB the head of the second linked list
     * @return the intersection node, or null if no intersection exists
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != temp2) {
            temp1 = (temp1 == null) ? headB : temp1.next;
            temp2 = (temp2 == null) ? headA : temp2.next;
        }

        return temp1; // either intersection node or null
    }

    /**
     * Main method to test the getIntersectionNode functionality.
     */
    public static void main(String[] args) {
        // Example setup:
        // List A: 4 -> 1 -> 8 -> 4 -> 5
        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        // Intersection at node with value 8

        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersect;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect;

        IntersectionOf2LinkedLists solution = new IntersectionOf2LinkedLists();
        ListNode result = solution.getIntersectionNode(headA, headB);

        System.out.println("Intersection Node Value: " + (result != null ? result.val : "No Intersection"));
        // Expected Output: 8
    }
}
