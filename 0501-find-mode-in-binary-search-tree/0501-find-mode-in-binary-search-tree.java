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
    Map<Integer, Integer> freqs = new HashMap<>();

    public int[] findMode(TreeNode root) {
        populate(root);
        int maxFreq = Integer.MIN_VALUE;

        for (int x : freqs.values()) {
            maxFreq = x > maxFreq ? x : maxFreq;
        }

        List<Integer> ret = new ArrayList<>();
        for (int x : freqs.keySet()) {
            if (freqs.get(x) == maxFreq) {
                ret.add(x);
            }
        }

        int[] arr = new int[ret.size()];
        for (int i=0; i<ret.size(); i++) {
            arr[i] = ret.get(i);
        }

        return arr;
    }

    public void populate(TreeNode root) {
        if (root == null) {
            return;
        }

        freqs.put(root.val, freqs.getOrDefault(root.val, 0)+1);
        populate(root.left);
        populate(root.right);
    }
}