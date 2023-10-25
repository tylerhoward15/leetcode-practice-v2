class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> freqs = new HashMap<>(); // k: number, v: occurences

        for (int i=nums.length-1; i>=0; i--) {
            final int freq = freqs.getOrDefault(nums[i], 0);
            if (freq < 2) {
                freqs.put(nums[i], freq+1);
            } else {
                removeElem(nums,i);
                ans++;
            }
        }

        return nums.length - ans;
    }

    public void removeElem(int[] nums, int index) {
        for (int i=index+1; i<nums.length;i++){
            nums[i-1] = nums[i];
        }
    }
}