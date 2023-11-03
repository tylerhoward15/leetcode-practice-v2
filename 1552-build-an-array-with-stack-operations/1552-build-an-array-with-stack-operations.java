class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ret = new ArrayList<>();
        int val = 1;
        for (int i=0; i<target.length; i++) {
            if (target[i] == val) {
                ret.add("Push");
            } else {
                while(target[i] != val && val <=n) {
                    ret.add("Push");
                    ret.add("Pop");
                    val++;
                }
                ret.add("Push");
            }
            val++;
        }

        return ret;
    }
}