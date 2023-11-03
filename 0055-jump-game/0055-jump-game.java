class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        boolean hasNext = false;
        int[] subarr = new int[nums.length-1];
        for (int i=0; i<subarr.length; i++) {
            boolean canGoNext = canJump(nums, i, nums.length-1);
            if (canGoNext) {hasNext = true;}
            subarr[i] = nums[i];
        }

        if (!hasNext) return false;

        return canJump(subarr);
    }

    public boolean canJump(int[] nums, int fromIndex, int toIndex) {
        return nums[fromIndex] >= toIndex-fromIndex;
    }
}