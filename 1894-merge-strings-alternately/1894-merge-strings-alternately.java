class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ret = new StringBuilder();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < word1.length() && rightIndex < word2.length()) {
            ret.append(word1.charAt(leftIndex));
            ret.append(word2.charAt(rightIndex));
            leftIndex++;
            rightIndex++;
        }

        if (word1.length() > word2.length()) {
            ret.append(word1.substring(leftIndex));
        } else {
            ret.append(word2.substring(rightIndex));
        }

        return ret.toString();
    }
}