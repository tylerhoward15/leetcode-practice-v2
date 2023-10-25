class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0;
        int retSize = 0;
        List<Integer> biggestNums = new ArrayList<>();
        List<Integer> currentNums = new ArrayList<>();

        // List<Integer> temp = Arrays.asList(280746028,64,256);
        // System.out.println(isNice(temp, 33554432));
        

        for(int right=0; right<nums.length; right++) {
            final int rightNum = nums[right];
            currentNums.add(rightNum);

            while (!isNice(currentNums, rightNum)) {
                currentNums.remove(0);
                left++;
            }

            if (currentNums.size() > biggestNums.size()) {
                biggestNums.clear();
                for (Integer x : currentNums) {
                    biggestNums.add(x);
                }
            }
        }

        System.out.println(currentNums);
        System.out.println(biggestNums);

        return biggestNums.size();
    }

    public boolean isNice(List<Integer> nums, int val) {
        boolean hasSeenSelf = false;
        if (nums.size() == 1) {
            return true;
        }
        for (int i=0; i<nums.size(); i++) {
            final int x = nums.get(i);
            if (x == val) {
                if (hasSeenSelf) {
                    return false;
                }
                hasSeenSelf = true;
            } else if ((val & x) != 0) {
                return false;
            }
        }
        return true;







        // if (nums.size() == 1) {
        //     return true;
        // }
        // return nums.stream().allMatch(x -> {
        //     if (x == val) {
        //         if (hasSeenSelf) {
        //             return false;
        //         }
        //         hasSeenSelf = true;
        //     } 

        //     return (val == x) || ((val & x) == 0);
        // });
    }
}