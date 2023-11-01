class Solution {
    public int fib(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        
        return fib(map, n);
    }

    public int fib(Map<Integer, Integer> memo, int n) {
        if (!memo.containsKey(n)) {
            memo.put(n, fib(memo, n-1) + fib(memo, n-2));
        }
        return memo.get(n);
    }
}