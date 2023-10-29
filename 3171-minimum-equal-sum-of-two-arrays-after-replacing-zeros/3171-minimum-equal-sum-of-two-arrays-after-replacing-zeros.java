class Solution {
    public long minSum(int[] nums1, int[] nums2) {        
        int zeroes1 = 0;
        long sum1 = 0;
        for(int i=0; i<nums1.length; i++) {
            final int curr = nums1[i];
            if (curr == 0) {
                zeroes1++;
            }
            sum1 += curr;
        }


        int zeroes2 = 0;
        long sum2 = 0;
        for(int i=0; i<nums2.length; i++) {
            final int curr = nums2[i];
            if (curr == 0) {
                zeroes2++;
            }
            sum2 += curr;
        }
    
        
        if (zeroes1 > 0 && zeroes2 > 0) {
            long max = Math.max(sum1+zeroes1,sum2+zeroes2);
            return max;
        }
        
        if (zeroes1 > 0 && (sum1+zeroes1 <= sum2)) {
            return sum2;
        } else if (zeroes2 > 0 && (sum2+zeroes2 <= sum1)) {
            return sum1;
        } else if (sum1 == sum2 && (zeroes1 == zeroes2)) {
            return sum1;
        }else {
            return -1;
        }
        
    }
}