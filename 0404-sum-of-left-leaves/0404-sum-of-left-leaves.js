/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfLeftLeaves = function(root) {
    let ret = 0
    if (root == null)   return 0;

    if (root.left != null && root.left.left == null && root.left.right == null){
        ret = root.left.val;
    }

    const left = sumOfLeftLeaves(root.left)
    const right = sumOfLeftLeaves(root.right)
    
    // console.log(left,right)

    return ret + left + right
};