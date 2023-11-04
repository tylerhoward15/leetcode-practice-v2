# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        q = []
        ret = []
        q.append(root)
        while len(q) != 0:
            level = []
            size = len(q)
            for _ in range(size):
                curr: TreeNode = q.pop(0)
                if curr is not None:
                    level.append(curr.val)
                    if curr.left is not None:
                        q.append(curr.left)
                    if curr.right is not None:
                        q.append(curr.right)
            if len(level)>0:
                ret.append(level)
                
        return ret