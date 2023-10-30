class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int right = nums.length-1;
        int left = 0;
        int equals = 0;

        while (left < right){
            if (nums[left] == val) {
                equals++;

                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
            } else {
                left++;
            }
        }
        if (nums[left] == val) {equals++;}
        return nums.length - equals;
    }
}