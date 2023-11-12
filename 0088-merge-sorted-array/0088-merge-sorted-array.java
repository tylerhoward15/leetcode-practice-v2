class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> ret = new ArrayList<>();
        int one = 0;
        int two = 0;

        while (one < m && two < n) {
            if (nums1[one] <= nums2[two]) {
                ret.add(nums1[one]);
                one++;
            } else {
                ret.add(nums2[two]);
                two++;
            }
        }
        while (one < m) {
            ret.add(nums1[one]);
            one++;
        }
        while (two < n) {
            ret.add(nums2[two]);
            two++;
        }

        for (int i=0; i<ret.size(); i++) {
            nums1[i] = ret.get(i);
        }
    }
}