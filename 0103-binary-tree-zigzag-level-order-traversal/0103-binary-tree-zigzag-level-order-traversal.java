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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ret = new ArrayList<>();
        q.add(root);
        int depth = 0;

        while(!q.isEmpty()) {
            depth++;
            final int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0; i<size; i++) {
                final TreeNode curr = q.poll();
                if (curr != null) {
                    level.add(curr.val);
                    if (curr.left != null) {q.add(curr.left);}
                    if (curr.right != null) {q.add(curr.right);}
                }

            }

            if (depth % 2 == 0) {
                Collections.reverse(level);
                // level.reverse();
            }
            if (!level.isEmpty()) {
                ret.add(level);
            }
        }
        return ret;
    }
}