class Solution:
    def getLastMoment(self, n: int, left: List[int], right: List[int]) -> int:
        leftSteps = max(left) if len(left)>0 else 0
        rightSteps = n-(min(right) if len(right)>0 else n)
        return max(leftSteps,rightSteps)
        