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
        final Queue<TreeNode> q = new LinkedList<>();
        final List<List<Integer>> ret = new ArrayList<>();

        q.add(root);

        while(!q.isEmpty()) {
            final int size = q.size();
            final List<Integer> level = new ArrayList<>();

            for(int i=0; i<size; i++) {
                final TreeNode curr = q.poll();
                if (curr != null) {
                    level.add(curr.val);

                    if(curr.left != null) {
                        q.add(curr.left);
                    }
                    if(curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
            if (level.size() != 0) {
                ret.add(level);
            }
        }

        return ret;
    }
}