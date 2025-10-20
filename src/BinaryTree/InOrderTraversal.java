package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to perform an inorder traversal on a binary tree.
 * The traversal order is: Left → Root → Right.
 */
public class InOrderTraversal {

    /**
     * Helper method to recursively traverse the tree in inorder.
     *
     * @param root   the current node in the binary tree
     * @param result the list used to store the traversal result
     */
    private void traverse(TreeNode root, List<Integer> result) {
        if (root == null) return;

        traverse(root.left, result);   // Traverse left subtree
        result.add(root.val);          // Visit root
        traverse(root.right, result);  // Traverse right subtree
    }

    /**
     * Performs an inorder traversal on the given binary tree.
     *
     * @param root the root node of the binary tree
     * @return a list containing the values in inorder order
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    /**
     * Main method to test the inorderTraversal functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        InOrderTraversal solution = new InOrderTraversal();

        // Sample tree:
        //     1
        //      \
        //       2
        //      /
        //     3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Inorder Traversal: " + solution.inorderTraversal(root)); // Output: [1, 3, 2]
    }
}
