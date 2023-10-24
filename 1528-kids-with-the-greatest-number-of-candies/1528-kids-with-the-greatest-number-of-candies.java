class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ret = new ArrayList<>();
        
        int max = Arrays.stream(candies).max().getAsInt();

        for (int i=0; i<candies.length; i++) {
            ret.add(candies[i]+extraCandies >= max);
        }
        return ret;
    }
}