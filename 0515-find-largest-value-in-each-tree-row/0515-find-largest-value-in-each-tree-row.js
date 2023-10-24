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
var largestValues = function(root) {
    if (root == null) return []
    let ret = []
    const q = []
    q.push(root)

    while(q.length != 0) {
        const size = q.length
        const level = []

        for (let i = 0; i < size; i++) {
            const curr = q.shift()
            if (curr) {
                if (curr.left) {q.push(curr.left)}
                if (curr.right) {q.push(curr.right)}
                level.push(curr.val)
            }
        }
        ret.push(Math.max(...level))
    }

    return ret
};