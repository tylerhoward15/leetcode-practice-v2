class Solution {
    Map<Integer, Integer> scores = new HashMap<>();

    public int rob(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            final int currScore = score(nums, i);
            max = currScore > max ? currScore : max;
        }

        return max;
    }

    public int score(int[] nums, int start) {
        if (start >= nums.length) {
            return 0;
        } else if (!scores.containsKey(start)) {
            if ((start + 2) >= nums.length) {
                scores.put(start, nums[start]);
            } else {
                int max = Integer.MIN_VALUE;
                for (int i=start+2; i<nums.length; i++) {
                    int temp = score(nums, i);
                    max = temp > max ? temp : max;
                }
                scores.put(start, nums[start] + max);
            }
        }

        return scores.get(start);
    }

    // public int[] getSubarray(int[] nums, int start) {
    //     System.out.println(Arrays.toString(nums) + " start: " + start);
    //     int[] ret = new int[nums.length - start];
    //     for (int i=0; (i+start)<nums.length; i++) {
    //         ret[i] = nums[i+start];
    //     }

    //     return ret;
    // }
}