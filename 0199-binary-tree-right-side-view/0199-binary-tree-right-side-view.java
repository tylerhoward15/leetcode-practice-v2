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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ret = new ArrayList<>();
        q.add(root);

        while(!q.isEmpty()) {
            final int size = q.size();
            TreeNode lastSeen = null;

            for (int i=0; i<size; i++) {
                final TreeNode curr = q.poll();
                if (curr != null) {
                    lastSeen = curr;
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                } 
            }

            if (lastSeen != null) {
                ret.add(lastSeen.val);
            }
        }

        return ret;
    }
}