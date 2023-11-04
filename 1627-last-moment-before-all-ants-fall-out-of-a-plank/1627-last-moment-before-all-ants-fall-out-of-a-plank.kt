class Solution {
    fun getLastMoment(n: Int, left: IntArray, right: IntArray): Int {
        val leftList = left.toMutableList();
        val rightList = right.toMutableList();
        val leftSteps = (leftList.maxOrNull() ?: 0);
        val rightSteps = n - (rightList.minOrNull() ?: n);

        return maxOf(leftSteps, rightSteps);
    }
}