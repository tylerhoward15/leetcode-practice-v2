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
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> ret = new ArrayList<>();
        while(!q.isEmpty()) {
            final int size = q.size();
            List<Integer> nums = new ArrayList<>();
            
            for (int i=0; i<size; i++) {
                TreeNode current = q.poll();
                if (current != null) {
                    nums.add(current.val);
                    if (current.left != null)   q.add(current.left);
                    if (current.right != null)   q.add(current.right);
                }
            }

            ret.add(getMax(nums));
        }
        

        return ret;
    }

    public int getMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int x : list) {
            max = x > max ? x : max;
        }
        return max;
    }
}