/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        public int countNodes(TreeNode root) {
        // Check if the tree is empty
        if (root == null) {
            return 0;
        }

        // Find the height of the left subtree
        int lh = findHeightLeft(root);
        // Find the height of the right subtree
        int rh = findHeightRight(root);

        // If the heights are equal, the tree
        // is a full binary tree, and we can
        // calculate the total nodes
        if (lh == rh) {
            return (1 << lh) - 1;
        }

        // If the heights are not equal,
        // recursively count nodes in the
        // left and right subtrees
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Function to find the
    // height of the left subtree
    private int findHeightLeft(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    // Function to find the
    // height of the right subtree
    private int findHeightRight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}