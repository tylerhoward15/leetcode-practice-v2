class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        List<Long> list1 = new ArrayList<>();
        for(int x : nums1) {
            list1.add(Long.valueOf(x));
        }
        List<Long> list2 = new ArrayList<>();
        for(int x : nums2) {
            list2.add(Long.valueOf(x));
        }
        
        
        int index1 = list1.size()-1;
        int index2 = list2.size()-1;
        
        int zeroes1 = countZeroes(list1);
        int zeroes2 = countZeroes(list2);

        long sum1 = sumList(list1);
        long sum2 = sumList(list2);
    
        
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
    
    public int countZeroes(List<Long> list) {
        int counter = 0;
        for (Long x : list) {
            if (x==0) {
                counter++;
            }
        }
        
        return counter;
    }
    
    public long sumList(List<Long> list) {
        long sum = 0;
        for (Long x : list) {
            sum+=x;
        }
        return sum;
    }
}