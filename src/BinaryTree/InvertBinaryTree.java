package BinaryTree;

/**
 * This class provides a method to invert a binary tree.
 * Inversion means swapping the left and right child of every node.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h) — due to recursive stack, where h is the tree height.
 */
public class InvertBinaryTree {

    /**
     * Inverts the given binary tree.
     *
     * @param root the root of the binary tree
     * @return the root of the inverted binary tree
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    /**
     * Helper method to perform inorder traversal for displaying the tree.
     *
     * @param root the root of the binary tree
     */
    private static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    /**
     * Main method to test the invertTree functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Construct sample binary tree
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );

        InvertBinaryTree solution = new InvertBinaryTree();

        System.out.print("Original Tree (Inorder): ");
        printInorder(root);
        System.out.println();

        root = solution.invertTree(root);

        System.out.print("Inverted Tree (Inorder): ");
        printInorder(root);
        System.out.println();
    }
}
