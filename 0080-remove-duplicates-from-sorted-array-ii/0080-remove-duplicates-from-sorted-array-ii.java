class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int length = nums.length;
        int i = 1;

        while (i < length) {
            count++;
            if (nums[i] != nums[i-1]) {
                count = 1;
            }

            if (count > 2) {
                shift(nums, i);
                length--;
            } else {
                i++;
            }
        }


        return length;
    }

    public int[] shift(int[] arr, int index) {
        for (int i=index+1; i<arr.length;i++) {
            arr[i-1] = arr[i];
        }

        return arr;
    }
}