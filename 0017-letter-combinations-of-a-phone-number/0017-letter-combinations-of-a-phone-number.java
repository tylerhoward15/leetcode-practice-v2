class Solution {
    Map<String, List<String>> digitChars = new HashMap<>();

    public Solution() {
        digitChars.put("2", makeList("a","b","c"));
        digitChars.put("3", makeList("d","e","f"));

        digitChars.put("4", makeList("g","h","i"));
        digitChars.put("5", makeList("j","k","l"));
        digitChars.put("6", makeList("m","n","o"));

        digitChars.put("7", makeList("p","q","r","s"));
        digitChars.put("8", makeList("t","u","v"));
        digitChars.put("9", makeList("w","x","y","z"));
    }

    public List<String> letterCombinations(String digits) {
        return backtrack(digitChars, digits);
    }

    public List<String> backtrack(Map<String, List<String>> memo, String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        else if (memo.containsKey(digits)) {
            return memo.get(digits);
        } else {
            // combine charAt(0) and rest of digits
            // place that as memo for digits
            List<String> combo = new ArrayList<>();
            List<String> base = memo.get(digits.substring(0,1));
            List<String> toAdd = backtrack(memo, digits.substring(1));

            for (String x : base) {
                for (String y : toAdd) {
                    combo.add(x + y);
                }
            }
            memo.put(digits, combo);

        }

        return memo.get(digits);

        // int ans = 0;
        // for (ITERATE_OVER_INPUT) {
        //     // modify the current memo
        //     ans += backtrack(memo, OTHER_ARGUMENTS...)
        //     // undo the modification of the current memo
        // }
    }

    public List<String> makeList(String... x) {
        return new ArrayList<String>(Arrays.asList(x));
    }
}