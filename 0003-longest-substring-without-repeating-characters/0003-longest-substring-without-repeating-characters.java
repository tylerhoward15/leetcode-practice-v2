class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder longest = new StringBuilder();
        int left = 0;
        int maxSize = 0;

        for(int right=0; right<s.length(); right++) {
            longest.append(s.charAt(right));

            while(!isUnique(s.substring(left,right+1))) {
                longest.deleteCharAt(0);
                left++;
            }
            maxSize = longest.length() > maxSize ? longest.length() : maxSize;
        }

        return maxSize;
    }

    public boolean isUnique(String str) {
        Set<Character> set = new HashSet<>();
        List<Character> chars = new ArrayList<>();

        for (char x : str.toCharArray()) {
            set.add(x);
            chars.add(x);
        }

        return set.size() == chars.size();
    }
}