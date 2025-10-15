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
    public boolean isBalanced(TreeNode root) {
        int ans=maxDepth(root);
        if(ans==-1){
            return false;
        }
        return true;
    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lh=0;
        int rh=0;
        lh=maxDepth(root.left);
        rh=maxDepth(root.right);
        if(lh==-1||rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;
    }
}