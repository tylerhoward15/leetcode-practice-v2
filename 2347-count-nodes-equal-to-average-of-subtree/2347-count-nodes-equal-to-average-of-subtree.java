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
    public int averageOfSubtree(TreeNode root) {
        if (root == null) {return 0;}

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        int leftCount = count(root.left);
        int rightCount = count(root.right);

        if (leftCount+rightCount == 0) {return 1;}
        int average = (leftSum+rightSum + root.val)/(leftCount+rightCount + 1);

        if (average == root.val) {
            return 1 + averageOfSubtree(root.left) + averageOfSubtree(root.right);
        }

        return averageOfSubtree(root.left) + averageOfSubtree(root.right);

    }

    public int sum(TreeNode root) {
        if (root == null) {return 0;}

        int left = sum(root.left);
        int right = sum(root.right);

        return root.val + left + right;
    }

    public int count(TreeNode root) {
        if (root == null) {return 0;}

        int left = count(root.left);
        int right = count(root.right);

        return 1 + left + right;
    } 
}