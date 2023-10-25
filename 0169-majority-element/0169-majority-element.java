class Solution {
    public int majorityElement(int[] nums) {
        final int target = nums.length / 2;
        Map<Integer, Integer> freqs = new HashMap<>(); // k: num, v: freq
        for (int x : nums) {
            int freq = freqs.getOrDefault(x, 0);
            if (freq+1 > target) {return x;}
            else {freqs.put(x, freq+1);}
        }
        return -1;
    }
}