package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to perform a postorder traversal on a binary tree.
 * The traversal order is: Left → Right → Root.
 */
public class PostOrderTraversal {

    /**
     * Helper method to recursively traverse the tree in postorder.
     *
     * @param root   the current node in the binary tree
     * @param result the list used to store the traversal result
     */
    private void traverse(TreeNode root, List<Integer> result) {
        if (root == null) return;

        traverse(root.left, result);    // Traverse left subtree
        traverse(root.right, result);   // Traverse right subtree
        result.add(root.val);           // Visit root
    }

    /**
     * Performs a postorder traversal on the given binary tree.
     *
     * @param root the root node of the binary tree
     * @return a list containing the values in postorder order
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    /**
     * Main method to test the postorderTraversal functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        PostOrderTraversal solution = new PostOrderTraversal();

        // Sample tree:
        //     1
        //      \
        //       2
        //      /
        //     3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Postorder Traversal: " + solution.postorderTraversal(root)); // Output: [3, 2, 1]
    }
}
