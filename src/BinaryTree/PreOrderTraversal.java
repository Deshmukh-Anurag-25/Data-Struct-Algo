package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to perform a preorder traversal on a binary tree.
 * The traversal order is: Root → Left → Right.
 */
public class PreOrderTraversal {

    /**
     * Helper method to recursively traverse the tree in preorder.
     *
     * @param root   the current node in the binary tree
     * @param result the list used to store the traversal result
     */
    private void traverse(TreeNode root, List<Integer> result) {
        if (root == null) return;

        result.add(root.val);          // Visit root
        traverse(root.left, result);   // Traverse left subtree
        traverse(root.right, result);  // Traverse right subtree
    }

    /**
     * Performs a preorder traversal on the given binary tree.
     *
     * @param root the root node of the binary tree
     * @return a list containing the values in preorder order
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    /**
     * Main method to test the preorderTraversal functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        PreOrderTraversal solution = new PreOrderTraversal();

        // Sample tree:
        //     1
        //      \
        //       2
        //      /
        //     3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Preorder Traversal: " + solution.preorderTraversal(root)); // Output: [1, 2, 3]
    }
}
