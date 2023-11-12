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

        while (!q.isEmpty()) {
            final int size = q.size();
            final int[] level = new int[size];
            int insert = 0;

            for (int i=0; i<size; i++) {
                TreeNode curr = q.poll();
                if (curr != null) {
                    level[insert] = curr.val;
                    insert++;

                    if (curr.left != null) {q.add(curr.left);}
                    if (curr.right != null) {q.add(curr.right);}
                }
            }
            if (insert != 0) {
                ret.add((List<Integer>) Arrays.stream(level).boxed().toList());
            }
        }

        return ret;
    }
}