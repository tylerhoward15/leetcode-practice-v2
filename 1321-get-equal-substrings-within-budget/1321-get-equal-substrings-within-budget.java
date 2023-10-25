class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int size = s.length();
        int left = 0;
        int maxSize = 0;
        int currentCost = 0;

        for (int right=0; right<size; right++) {
            final int diff = Math.abs(s.charAt(right) - t.charAt(right));
            // System.out.println("adding right at index " + right);
            currentCost += diff;
            
            while(currentCost > maxCost) {
                final int leftDiff = Math.abs(s.charAt(left) - t.charAt(left));
                // System.out.println("removing left at index " + left);
                currentCost -= leftDiff;
                left++;
            }

            int currentSize = right - left+1;
            maxSize = currentSize > maxSize ? currentSize : maxSize;

            // System.out.println("Current Cost: " + currentCost);
        }
        return maxSize;
    }
}