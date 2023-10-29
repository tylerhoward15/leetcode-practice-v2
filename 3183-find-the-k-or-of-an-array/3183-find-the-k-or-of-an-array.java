class Solution {
    public int findKOr(int[] nums, int k) {
        if (k == 1) {
            int run = 0;
            for (int x : nums) {
                run = run | x;
            }
            return run;
        }
        
        else if (k == nums.length) {
            int run = nums[0];
            for (int i=1; i<nums.length; i++) {
                run = run & nums[i];
            }
            return run;
        }
        
        else {
            // int test = (nums[0] >> 1) & 1;
            // System.out.println(test);
            
            Map<Integer, Integer> bitFreq = new HashMap<>();  // val at index 0 means number of occurense where 0th bit is set
            
            for (int i=0; i<nums.length; i++) {
                int n = 0;
                while ((nums[i] >> n) > 0) {
                    int nthBit = (nums[i] >> n) & 1; 
                    if (nthBit == 1) {
                        bitFreq.put(n, bitFreq.getOrDefault(n,0)+1); 
                    }
                    n++;
                }
 
            }
            // System.out.println(bitFreq.keySet());
            // System.out.println(bitFreq.values());
            
            int retVal = 0;
            for (Integer key : bitFreq.keySet()) {
                if (bitFreq.get(key) >= k) {
                    retVal += Math.pow(2, key);    
                }
            }
            return retVal;
        }
    }
    
    // we need to count how many nums have the ith bit set
    // return 2^i + 2^i..n for the answer
}