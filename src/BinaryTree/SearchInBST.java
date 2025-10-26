package BinaryTree;

/**
 * This class provides a method to search for a given value
 * in a Binary Search Tree (BST) using recursion.
 *
 * Time Complexity: O(h), where h is the height of the tree.
 * Space Complexity: O(h) due to recursive stack calls.
 */
public class SearchInBST {

    /**
     * Searches for a node with the specified value in the BST.
     *
     * @param root the root of the binary search tree
     * @param val  the value to search for
     * @return the TreeNode containing the value, or null if not found
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;

        if (root.val > val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }

    /**
     * Main method to test the searchBST functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Construct a sample BST
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7)
        );

        SearchInBST solution = new SearchInBST();

        TreeNode result1 = solution.searchBST(root, 2);
        System.out.println("Search 2 → " + (result1 != null ? result1.val : "Not Found"));

        TreeNode result2 = solution.searchBST(root, 5);
        System.out.println("Search 5 → " + (result2 != null ? result2.val : "Not Found"));
    }
}
