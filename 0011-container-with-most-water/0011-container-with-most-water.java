class Solution {
    public int maxArea(int[] height) {
        int largestSize = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;

        while(left < right) {
            final int left_y = height[left];
            final int right_y = height[right];
            final int x = right-left;
            final int currSize = Math.min(left_y, right_y) * x;
            largestSize = currSize > largestSize ? currSize : largestSize;

            if (left_y < right_y) {
                left++;
            } else {
                right--;
            }
        }

        return largestSize;
    }
}