class Solution {
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        StringBuilder ret = new StringBuilder();

        for (int i=strs.length-1; i >=0; i--) {
            if (!strs[i].isEmpty()){
                ret.append(strs[i]).append(" ");
            }
        }

        return ret.toString().trim();
    }
}