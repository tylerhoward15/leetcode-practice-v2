class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3)     return 0; 

        int ret = 0;
        int left = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<3; i++) {
            sb.append(s.charAt(i));
        }

        for (int right=3; right<s.length(); right++) {
            System.out.println(sb.toString());
            if (isUnique(sb.toString())) {
                ret++;
            }
            sb.append(s.charAt(right));
            sb.deleteCharAt(0);
        }
        if (isUnique(sb.toString())) {
            ret++;
        }
        return ret;
    }

    public boolean isUnique(String s) {
        return s.length() == stringToSet(s).size();
    }

    public Set<Character> stringToSet(String s) {
        Set<Character> set = new HashSet<>();

        for(char x : s.toCharArray()) {
            set.add(x);
        }
        return set;
    }
}