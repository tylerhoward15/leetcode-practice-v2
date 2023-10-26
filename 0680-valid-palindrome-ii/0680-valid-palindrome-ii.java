class Solution {
    public boolean validPalindrome(String s) {
        return validPalindrome(s, false);
    }


    public boolean validPalindrome(String s, boolean hasSkipped) {
        int right = s.length()-1;
        int left = 0;
        // boolean hasSkipped = false;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (leftChar == rightChar) { // left is equal to right
                left++;
                right--;
            } else if (!hasSkipped) {
                String rightContinuation = s.substring(left,right);
                String leftContinuation = s.substring(left+1,right+1);

                return validPalindrome(leftContinuation, true) || validPalindrome(rightContinuation, true);
            } else {
                return false;
            }
            // } else if (!hasSkipped && leftChar == s.charAt(right-1)){ // next in order of right is equal to left
            //     right--;
            //     hasSkipped = true;
            // } else if (!hasSkipped && rightChar == s.charAt(left+1)){  // next in order of left is equal to right
            //     left++;
            //     hasSkipped = true;
            // } else {
            //     return false;
            // }
        }
        
        return true;
    }
}