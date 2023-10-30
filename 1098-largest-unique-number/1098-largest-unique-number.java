class Solution {
    public int largestUniqueNumber(int[] nums) {
        if (nums.length == 1) {return nums[0];}
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=nums.length-1; i>=0; i--) {
            final int curr = nums[i];
            int distance = 0;
            while(i > 0 && nums[i-1] == curr) {
                distance++;
                i--;
            }
            if(distance == 0) {
                return nums[i];
            }
        }

        return -1;
    }
}