class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // map value to index

        for (int i=0; i<nums.length; i++) {
            final int val = nums[i];
            final int comp = map.getOrDefault(target-val, -1);
            if (comp != -1) {
                return new int[]{comp, i};
            }
            map.put(val, i);
        }
        return new int[]{-1};
    }
}