class Solution {
    Map<Integer, Integer> uniqueWays = new HashMap<>();

    public Solution() {
        uniqueWays.put(0, 0);
        uniqueWays.put(1, 1);
        uniqueWays.put(2, 2);
        uniqueWays.put(3, 3);
        uniqueWays.put(4, 5);
    
    }

    public int climbStairs(int n) {
        if (uniqueWays.containsKey(n)) {
            return uniqueWays.get(n);
        } else {
            uniqueWays.put(n, climbStairs(n-1) + climbStairs(n-2));
        }
        return uniqueWays.get(n);
    }
}

// To get to the nth step, its the n-1 step + 1