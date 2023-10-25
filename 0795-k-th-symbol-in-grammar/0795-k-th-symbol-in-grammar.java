class Solution {
    private int countBits (int n) {
        int answer = 0;
        while (n > 0) {
            ++answer;
            n = n & (n - 1);
        }
        return answer;
    }
    public int kthGrammar(int n, int k) {
        return countBits (k - 1) % 2;
    }
}