class Solution {
    public int fib(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 1);
        map.put(3,2);
        map.put(4, 3);


        fib(map, 0);
        return fib(map, n);
    }

    public int fib(Map<Integer, Integer> fibs, int n) {
        final int curr = fibs.getOrDefault(n, -1);

        if(curr == -1) {
            return fib(fibs, n-2) + fib(fibs, n-1);
        }

        return curr;
    }
}