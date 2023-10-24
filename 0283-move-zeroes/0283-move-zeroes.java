class Solution {
    public void moveZeroes(int[] nums) {

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                int fast = i;
                while(fast < nums.length && nums[fast] == 0){fast++;}
                if (fast >= nums.length) {break;}
                nums[i] = nums[fast];
                nums[fast] = 0;
            }
        }
    }
}