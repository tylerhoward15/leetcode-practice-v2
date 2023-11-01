class Solution {
    public int tribonacci(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0,0);
        memo.put(1,1);
        memo.put(2,1);

        return trib(memo, n);
    }

    public int trib(Map<Integer, Integer> memo, int n) {
        if (!memo.containsKey(n)) {
            memo.put(n, trib(memo, n-1) + trib(memo, n-2) + trib(memo, n-3));
        }
        return memo.get(n);
    }
}