class Solution {
    public int removeDuplicates(int[] nums) {
        final Stack<Integer> stack = new Stack<>();

        for (int num: nums) {
            // for monotonic decreasing, just flip the > to <
            while (!stack.empty() && stack.peek() >= num) {
                // do logic
                stack.pop();
            }

            stack.push(num);
        }
        final int[] arr = Arrays.stream(stack.toArray()).mapToInt(i -> (int)i).toArray();
        for (int i=0; i<arr.length; i++) {
          nums[i] = arr[i];
        }

        return stack.size();
    }
}