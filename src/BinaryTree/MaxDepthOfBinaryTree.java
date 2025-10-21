package BinaryTree;

/**
 * This class provides a method to find the maximum depth (height)
 * of a binary tree using recursion.
 *
 * The maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h), where h is the height of the tree
 * (due to the recursive call stack)
 */
public class MaxDepthOfBinaryTree {

    /**
     * Computes the maximum depth of a binary tree.
     *
     * @param root the root node of the binary tree
     * @return the maximum depth of the tree
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }

    /**
     * Main method to test the maxDepth functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        MaxDepthOfBinaryTree solution = new MaxDepthOfBinaryTree();

        // Sample tree:
        //       3
        //      / \
        //     9  20
        //       /  \
        //      15   7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println("Maximum Depth: " + solution.maxDepth(root)); // Output: 3
    }
}
