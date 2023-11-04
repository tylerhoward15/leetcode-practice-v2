class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        ret = len(nums) - nums.count(val)
        result = [x for x in nums if x!= val]
        for i,_ in enumerate(result):
            nums[i] = result[i]
        return ret
        
