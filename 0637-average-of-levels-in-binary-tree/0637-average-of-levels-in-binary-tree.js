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
 * @return {number[]}
 */
var averageOfLevels = function(root) {
    let q = []
    q.push(root)
    let res = []

    while (q.length != 0) {
        let qLen = q.length
        let level = []
        for (let i = 0; i < qLen; i++) {
            const node = q.shift()
            if (node != null) {
                level.push(node.val)
                if (node.left != null) q.push(node.left)
                if (node.right != null) q.push(node.right)
            }
        }
        const sum = level.reduce((acc, curr) => acc+curr, 0)
        const average = sum / level.length

        res.push(average)
    }
    return res;
};