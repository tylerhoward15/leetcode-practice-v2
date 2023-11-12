class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length-1, count = 0;

        while (left <= right) {
            if (nums[left] == val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                count++;
                right--;
            } else {
                left++;
            }
        }

        return nums.length-count;
    }
}