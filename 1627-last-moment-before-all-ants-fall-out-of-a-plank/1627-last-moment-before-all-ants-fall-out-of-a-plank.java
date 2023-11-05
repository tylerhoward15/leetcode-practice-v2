class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        List<Integer> leftList = getList(left);
        List<Integer> rightList = getList(right);
        int maxLeft = !leftList.isEmpty() ? Collections.max(leftList) : 0;
        int minRight = n - (!rightList.isEmpty() ? Collections.min(rightList) : n);

        return Math.max(maxLeft, minRight);
    }

    public List<Integer> getList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            list.add(x);
        }

        return list;

    }
}