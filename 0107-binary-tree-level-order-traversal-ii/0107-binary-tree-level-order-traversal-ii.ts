/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function levelOrderBottom(root: TreeNode | null): number[][] {
    const q: TreeNode[] = [];
    const ret: number[][] = [];
    
    q.push(root);

    while (q.length != 0) {
        const size: number = q.length;
        const level: number[] = [];
        for(let i: number = 0; i<size; i++) {
            const current: TreeNode = q.shift();
            if (current != null){
                level.push(current.val);
                if (current.left != null){q.push(current.left);}
                if (current.right != null){q.push(current.right);}
            }
        }

        if (level.length != 0) {ret.push(level);}
    }

    ret.reverse();
    return ret;
};