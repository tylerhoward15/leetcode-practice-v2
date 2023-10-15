/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {boolean}
 */
var leafSimilar = function(root1, root2) {
    const temp1 = calc(root1)
    const temp2 = calc(root2)

    const temp3 = temp1.filter(element => element != null);
    const temp4 = temp2.filter(element => element != null);

    temp3.every((elem, index) => {
        return elem === temp4[index];
    })

    return temp3.length === temp4.length && temp3.every((element, index) => element === temp4[index]);
};

function calc(root) {
    if (root == null) {
        return null
    }
    if (root.left == null && root.right == null) {
        return [root.val]
    }
    
    let left = calc(root.left)
    let right = calc(root.right)

    return [left,right].flat()
}