class Solution {
    public int countHomogenous(String s) {
        long count = 0;
        for (int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            int sub = i;
            while (sub < s.length() && s.charAt(sub) == curr) {
                sub++;
            }
            int sizeOfSubsequence = sub-i;
            System.out.println(sizeOfSubsequence);
            long special = special(sizeOfSubsequence);
            System.out.println(special);
            i=sub-1;
            count += special;
        }
        return (int)(count % (Math.pow(10,9) + 7));
    }

    public long special(int sizeOfSubsequence) {
        if (sizeOfSubsequence == 0) {return 0;}
        return sizeOfSubsequence + special(sizeOfSubsequence-1);
    }
}
