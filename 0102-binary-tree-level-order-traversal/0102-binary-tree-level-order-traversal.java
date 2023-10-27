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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ret = new ArrayList<>();
        q.add(root);

        while(!q.isEmpty()) {
            final List<Integer> level = new ArrayList<>();
            final int size = q.size();

            for (int i=0; i<size; i++) {
                final TreeNode current = q.poll();

                if (current != null) {
                    level.add(current.val);
                    if (current.left != null)   q.add(current.left);
                    if (current.right != null)   q.add(current.right);
                }
            }
            if (!level.isEmpty()) {
                ret.add(level);
            }
        }

        return ret;
    }
}