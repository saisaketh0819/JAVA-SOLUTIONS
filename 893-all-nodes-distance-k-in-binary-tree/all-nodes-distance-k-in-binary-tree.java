/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    Map<TreeNode, TreeNode> parent = new HashMap<>();
    Map<TreeNode, Integer> level = new HashMap<>();

    // Step 1: DFS to record parent and level
    private void dfs(TreeNode node, TreeNode par, int depth) {
        if (node == null) return;
        parent.put(node, par);
        level.put(node, depth);
        dfs(node.left, node, depth + 1);
        dfs(node.right, node, depth + 1);
    }

    // Step 2: Find LCA of two nodes
    private TreeNode lca(TreeNode a, TreeNode b) {
        if (a == null || b == null) return null;
        int la = level.get(a), lb = level.get(b);

        // Bring both to same level
        while (la > lb) { a = parent.get(a); la--; }
        while (lb > la) { b = parent.get(b); lb--; }

        // Move up until same node
        while (a != b) {
            a = parent.get(a);
            b = parent.get(b);
        }
        return a;
    }

    // Step 3: Main method
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        dfs(root, null, 0);
        List<Integer> res = new ArrayList<>();

        for (TreeNode node : level.keySet()) {
            TreeNode lcaNode = lca(node, target);
            int dist = level.get(node) + level.get(target) - 2 * level.get(lcaNode);
            if (dist == k) res.add(node.val);
        }
        return res;
    }
}